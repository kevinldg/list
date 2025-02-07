package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    Map<Integer, Student> students = new HashMap<>();

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.put(student.getId(), student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student.getId());
    }

    public Student findStudentById(int id) {
        return this.students.get(id);
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
