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

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student findStudentById(int id) {
        for (Student student : this.students) {
            if (student.getId() == id) {
                return student;
            }
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
