package ir.sharif.math.bp96.edu.management;

import ir.sharif.math.bp96.edu.data.Course;

public class CourseManagement {

    private Course[] courses = new Course[100];
    private int courseCount = 0;

    public void addCourse(Course c) {
        courses[courseCount++] = c;
    }

    public Course getCourseByName(String name) {
        for (int i=0; i<courseCount; i++) {
            if (courses[i].getName().equals(name)) {
                return courses[i];
            }
        }
        return null;
    }


}
