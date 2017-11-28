package edu.data;

import edu.man.ManagersContainer;

public class Course {

	private String name;
	private String courseId;
	private String semester;
	private ManagersContainer managersContainer;

	public Course(ManagersContainer managersContainer, String name, String courseId, String semester) {
		this.name = name;
		this.courseId = courseId;
		this.semester = semester;
		this.managersContainer = managersContainer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}



	@Override
	public String toString() {
		return "edu.data.Course{" +
				"name='" + name + '\'' +
				", courseId='" + courseId + '\'' +
				", semester='" + semester + '\'' +
				'}';
	}

	public Enrolment[] getEnrolments() {
		return managersContainer.getEnrolmentManager().getCourseEnrolments(this);
	}
}
