package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent(new Student(123, "Max", "Mustermann"));
        school.addStudent(new Student(456, "Erika", "Mustermann"));

        List<Student> students = school.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        Student foundStudent = school.findStudentById(123);
        if (foundStudent != null) {
            System.out.println("Student gefunden: " + foundStudent);
        } else {
            System.out.println("Student nicht gefunden");
        }
    }
}