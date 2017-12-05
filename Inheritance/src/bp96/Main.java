package bp96;

import bp96.data.Person;
import bp96.data.Professor;
import bp96.data.Student;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Alireza", "77777777", "0008888888");
//        student1.setStudentId("77777777");
//        student1.setName("Alireza");
//        student1.setNationalId("0008888888");

        Professor prof1 = new Professor("Hadi", "007777777", "310");
//        prof1.setName("Hadi");
//        prof1.setRoomNo();
//        prof1.setNationalId();

//        Person p1 = new Person("Ali", "123123123");

        System.out.println("Std: " + student1.toString() + " " +
                "prof: " + prof1.toString());

    }
}
