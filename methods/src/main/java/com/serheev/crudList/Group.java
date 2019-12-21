package com.serheev.crudList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Group {
    private List<Student> students;
    private int id;
    private int course;
    private String faculty;
}
