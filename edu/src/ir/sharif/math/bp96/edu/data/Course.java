package ir.sharif.math.bp96.edu.data;

public class Course {
    private String name;
    private Enrolment[] enrolments = new Enrolment[100];
    private int enrolmentCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String name) {
        this.name = name;
    }

    public void addEnrolment(Enrolment e) {
        enrolments[enrolmentCount] = e;
        enrolmentCount++;
    }

    public Enrolment[] getEnrolments() {
//        return enrolments;
        Enrolment[] result = new Enrolment[enrolmentCount];
        System.arraycopy(enrolments, 0,
                result, 0, enrolmentCount);
//        for (int i=0; i<enrolmentCount; i++) {
//            result[i] = enrolments[i];
//        }
        return result;
    }
















}
