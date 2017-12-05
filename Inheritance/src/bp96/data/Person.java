package bp96.data;

public abstract class Person {

    private String name;
    private String nationalId;

    public Person(String name, String nationalId) {
        this.name = name;
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String toString() {
        return "Person: " + name + " nationalId=" + nationalId;
    }














}
