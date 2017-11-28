package ir.sharif.math.bp96.edu;

import ir.sharif.math.bp96.edu.data.Course;
import ir.sharif.math.bp96.edu.data.Enrolment;
import ir.sharif.math.bp96.edu.data.Student;
import ir.sharif.math.bp96.edu.management.CourseManagement;
import ir.sharif.math.bp96.edu.management.StudentManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "data.txt";
        Scanner scanner = new Scanner(System.in);

        CourseManagement courseManagement = new CourseManagement();
        StudentManagement studentManagement = new StudentManagement();
        Database database = new Database(fileName);

        String[] operations = database.loadAllOperations();

        // Load from database

        database.initializeSaving();

        for (String o; ;) {
            o = scanner.next();
            if (o.equals("as")) {
                String stdId = scanner.next(),
                        stdName = scanner.next();
                studentManagement.addStudent(new Student(stdName, stdId));
                database.saveOperation("as " + stdId + " " + stdName);
            } else if (o.equals("ac")) {
                String name = scanner.next();
                courseManagement.addCourse(new Course(name));
                database.saveOperation("ac " + name);
            } else if (o.equals("e")) {
                String stdId = scanner.next(),
                        courseName = scanner.next();
                Course course = courseManagement.getCourseByName(courseName);
                Student student = studentManagement.getStudentById(stdId);
                Enrolment e = new Enrolment(
                        course,
                        student
                );
                course.addEnrolment(e);
                student.addEnrolment(e);
                database.saveOperation("e " + stdId + " " + courseName);
            } else if (o.equals("lce")) {
                String courseName = scanner.next();
                Course course = courseManagement.getCourseByName(courseName);
                Enrolment[] enrolments = course.getEnrolments();
//                for (int i=0; i<enrolments.length; i++) {
//                    Enrolment enrolment = enrolments[i];
                for (Enrolment enrolment : enrolments) {
                    System.out.println(" " + enrolment.getStudent().getStudentId() + " " +
                            enrolment.getStudent().getName() + " " +
                            enrolment.getCourse().getName() + " " +
                            enrolment.getMark());
                }
            } else if (o.equals("q")) {
                break;
            }
        }
    }
}
