package edu.man;

import edu.data.Course;
import edu.data.Enrolment;

public class EnrolmentManager {

	private Enrolment[] enrolments;
	private int enrolmentCount;

	public EnrolmentManager() {
		this.enrolments = new Enrolment[100];
		enrolmentCount = 0;
	}

	public Enrolment[] getCourseEnrolments(Course course) {
		Enrolment[] result = new Enrolment[100];
		int resultCount = 0;
		for (int i=0; i<enrolmentCount; i++) {
			if (enrolments[i].getCourse() == course) {
				result[resultCount++] = enrolments[i];
			}
		}

		Enrolment[] cleanResult = new Enrolment[resultCount];
		for (int i=0; i<resultCount; i++) {
			cleanResult[i] = result[i];
		}
		return cleanResult;
	}

	public void addEnrolment(Enrolment enrolment) {
		enrolments[enrolmentCount++] = enrolment;
	}
}
