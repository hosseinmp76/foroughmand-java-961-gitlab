package edu.man;

import sun.plugin.dom.core.CoreConstants;

public class ManagersContainer {

	private CourseManager courseManager;
	private StudentManager studentManager;
	private EnrolmentManager enrolmentManager;

	public ManagersContainer(CourseManager courseManager, StudentManager studentManager, EnrolmentManager enrolmentManager) {
		this.courseManager = courseManager;
		this.studentManager = studentManager;
		this.enrolmentManager = enrolmentManager;
	}

	public CourseManager getCourseManager() {
		return courseManager;
	}

	public StudentManager getStudentManager() {
		return studentManager;
	}

	public EnrolmentManager getEnrolmentManager() {
		return enrolmentManager;
	}
}
