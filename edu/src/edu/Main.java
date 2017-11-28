package edu;

import edu.data.Course;
import edu.man.CourseManager;
import edu.data.Enrolment;
import edu.data.Student;
import edu.man.EnrolmentManager;
import edu.man.ManagersContainer;
import edu.man.StudentManager;

public class Main {

	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();
		StudentManager studentManager = new StudentManager();
		EnrolmentManager enrolmentManager = new EnrolmentManager();

		ManagersContainer managersContainer = new ManagersContainer(courseManager, studentManager, enrolmentManager);


		courseManager.addCourse(new Course(managersContainer, "Math-1", "40212", "Fall 2017"));
		courseManager.addCourse(new Course(managersContainer, "BP", "40214", "Fall 2017"));
		courseManager.addCourse(new Course(managersContainer, "Math-1", "40212", "Fall 2016"));


		studentManager.addStudent(new Student(managersContainer, "Ali Ahmadi", "80286532"));
		studentManager.addStudent(new Student(managersContainer, "Gholi Ahmadi", "80286531"));

		Enrolment aliMath196 = new Enrolment(managersContainer,
				courseManager.getCourseByNameSemester("Math-1", "Fall 2017"),
				studentManager.getStudentById("80286532"));
		enrolmentManager.addEnrolment(aliMath196);
		aliMath196.setMark(12.0);
		enrolmentManager.addEnrolment(new Enrolment(managersContainer,
				courseManager.getCourseByNameSemester("Math-1", "Fall 2017"),
				studentManager.getStudentById("80286531")));

		Enrolment[] enrolments = courseManager.getCourseByNameSemester("Math-1", "Fall 2017").getEnrolments();

		for (Enrolment enrolment: enrolments) {
			System.out.println(enrolment.studentMarkToString());
		}


	}
}
