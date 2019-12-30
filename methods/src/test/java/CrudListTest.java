import com.serheev.crudList.Group;
import com.serheev.crudList.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.serheev.crudList.CrudService.removeStudent;
import static com.serheev.crudList.CrudService.removeAllStudents;
import static com.serheev.crudList.CrudService.getStudents;
import static com.serheev.crudList.CrudService.addStudent;
import static com.serheev.crudList.CrudService.createGroup;
import static com.serheev.crudList.CrudService.updateStudent;
import static org.junit.Assert.assertEquals;

public class CrudListTest {
    private static List<Student> students;
    private static Group groupMath;

    @Before
    public void studentsListShouldBeCreate() {
        students = new ArrayList<>();
        groupMath = createGroup(students, 1, 1, "Math");

        addStudent(groupMath, new Student(1, "Alexey", 17));
        addStudent(groupMath, new Student(2, "Boris", 18));
        addStudent(groupMath, new Student(3, "Henry", 19));
    }

    @Test
    public void studentShouldBeAddToList() {
        assertEquals(3, getStudents(groupMath).size());
        addStudent(groupMath, new Student(4, "Vasiliy", 21));
        assertEquals(4, getStudents(groupMath).size());
        assertEquals("Vasiliy", getStudents(groupMath).get(3).getName());
    }

    @Test
    public void studentsListShouldBeRead() {
        assertEquals(3, getStudents(groupMath).size());
        assertEquals("Henry", getStudents(groupMath).get(2).getName());
        assertEquals(3, getStudents(groupMath).get(2).getId());
        assertEquals(19, getStudents(groupMath).get(2).getAge());
    }

    @Test
    public void studentShouldBeUpdate() {
        assertEquals("Boris", getStudents(groupMath).get(1).getName());
        updateStudent(getStudents(groupMath).get(1), 1, "Yuriy", 18);
        assertEquals("Yuriy", getStudents(groupMath).get(1).getName());
    }

    @Test
    public void studentShouldBeRemove() {
        assertEquals(3, getStudents(groupMath).size());
        assertEquals("Boris", getStudents(groupMath).get(1).getName());
        removeStudent(groupMath, 1);
        assertEquals(2, getStudents(groupMath).size());
        assertEquals("Henry", getStudents(groupMath).get(1).getName());
    }

    @Test
    public void allStudentsShouldBeRemove() {
        assertEquals(3, getStudents(groupMath).size());
        removeAllStudents(groupMath);
        assertEquals(0, getStudents(groupMath).size());
    }
}
