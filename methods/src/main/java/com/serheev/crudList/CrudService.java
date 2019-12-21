package com.serheev.crudList;

import java.util.List;

public class CrudService {
    public static Group createGroup(List<Student> list, int id, int course, String faculty) {
        return new Group(list, 100, 1, "Math");
    }

    public static List<Student> getStudents(Group group) {
        return group.getStudents();
    }

    public static void addStudent(Group group, Student student) {
        getStudents(group).add(student);
    }

    public static void updateStudent(Student student, int id, String name, int age) {
        student.setId(id);
        student.setName(name);
        student.setAge(age);
    }

    public static void removeStudent(Group group, int id) {
        getStudents(group).remove(id);
    }

    public static void removeAllStudents(Group group) {
        getStudents(group).clear();
    }
}
