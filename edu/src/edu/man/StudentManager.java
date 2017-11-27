package edu.man;

import edu.data.Student;

public class StudentManager {

	private Student[] students;
	private int studentCount;

	public StudentManager() {
		students = new Student[100];
		studentCount = 0;
	}

	public void addStudent(Student student) {
		students[studentCount++] = student;
	}

	public Student getStudentById(String studentId) {
		for (int i=0; i<studentCount; i++) {
			if (students[i].getStudentId().equals(studentId)) {
				return students[i];
			}
		}
		return null;
	}
}
