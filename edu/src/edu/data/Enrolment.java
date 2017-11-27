package edu.data;

import edu.man.ManagersContainer;

public class Enrolment {
	private final ManagersContainer managerContainer;
	private Course course;
	private Student student;
	private double mark;

	public Enrolment(ManagersContainer managersContainer, Course course, Student student) {
		this.managerContainer = managersContainer;
		this.course = course;
		this.student = student;
		this.mark = -1;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public Course getCourse() {
		return course;
	}

	public String studentMarkToString() {
		String markString = "" + mark;
		if (mark < 0)
			markString = "N";
		return "" + student.getName() + "\t" + student.getStudentId() + "\t" + markString;
	}
}
