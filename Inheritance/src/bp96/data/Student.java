package bp96.data;

public class Student extends Person {
    private String studentId;

    public Student(String name, String nationalId, String studentId) {
        super(name, nationalId);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student: " + getName() + " " + " nationalId=" + getNationalId() + " std# " + studentId;
    }






}
