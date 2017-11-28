package edu.man;

import edu.data.Course;

public class CourseManager {

	private Course[] courses;
	private int courseCount;

	public CourseManager() {
		courses = new Course[100];
		courseCount = 0;
	}

	public Course getCourseByIndex(int i) {
		return courses[i];
	}

	public void setCourseByIndex(int i, Course course) {
		courses[i] = course;
	}

	public void addCourse(Course course) {
		courses[courseCount++] = course;
	}

	public Course getCourseByNameSemester(String name, String semester) {
		for (int i=0; i<courseCount; i++) {
			if (courses[i].getName().equals(name) && courses[i].getSemester().equals(semester)) {
				return courses[i];
			}
		}
		return null;
	}

}
