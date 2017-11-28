package ir.sharif.math.bp96.edu.data;

public class Enrolment {
    private Course course;
    private Student student;
    private double mark;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Enrolment(Course course, Student student) {

        this.course = course;
        this.student = student;
        this.mark = 0;
    }
}
