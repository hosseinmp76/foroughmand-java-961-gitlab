package edu.data;

import edu.man.ManagersContainer;

public class Student {

	private ManagersContainer managerContainer;
	private String name;
	private String studentId;

	public Student(ManagersContainer managersContainer, String name, String studentId) {
		this.managerContainer = managersContainer;
		this.name = name;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "edu.data.Student{" +
				"name='" + name + '\'' +
				", studentId='" + studentId + '\'' +
				'}';
	}
}
