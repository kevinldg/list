package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Course german = new Course("Deutsch", "Herr Mustermann", "ABC");
        Course english = new Course("Englisch", "Frau Mustermann", "DEF");
        Course math = new Course("Mathe", "Herr und Frau Mustermann", "GHI");

        Student max = new Student(123, "Max", "Mustermann");
        Student erika = new Student(456, "Erika", "Mustermann");

        max.addCourse(german);
        erika.addCourse(english);
        erika.addCourse(math);

        school.addStudent(max);
        school.addStudent(erika);

        System.out.println("### Students in school ###");
        List<Student> students = school.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("### Student by Id ###");
        Student foundStudent = school.findStudentById(123);
        if (foundStudent != null) {
            System.out.println("Student gefunden: " + foundStudent);
        } else {
            System.out.println("Student nicht gefunden");
        }

        System.out.println("### Courses from student ###");
        List<Course> maxCourses = school.getCoursesFromStudent(123);
        List<Course> erikaCourses = school.getCoursesFromStudent(456);
        System.out.println("Kurse von Max: " + maxCourses);
        System.out.println("Kurse von Erika: " + erikaCourses);
    }
}