package ir.sharif.math.bp96.edu.management;

import ir.sharif.math.bp96.edu.data.Student;

public class StudentManagement {

    private Student[] students = new Student[100];
    private int studentCount = 0;

    public void addStudent(Student s) {
        students[studentCount++] = s;
    }

    public Student getStudentById(String id) {
        for (int i=0; i<studentCount; i++) {
            if (students[i].getStudentId().equals(id)) {
                return students[i];
            }
        }
        return null;
    }

}
