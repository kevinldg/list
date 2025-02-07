package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public Student findStudentById(int id) {
        for (Student student : this.students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public List<Course> getCoursesFromStudent(int studentId) {
        Student student = this.findStudentById(studentId);

        if (student != null) {
            return student.getCourses();
        }

        return null;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
