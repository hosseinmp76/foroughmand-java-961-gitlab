public class Karname {

    public static void main(String[] args) {

        double physics1, math1, mathWriting, omumi, programming;

        System.out.println("Enter following marks, in following order: " +
                "Physics, Math, Math Writing, Omumi, Programming");

        java.util.Scanner s = new java.util.Scanner(System.in);

        physics1 = s.nextDouble();
        math1 = s.nextDouble();
        mathWriting = s.nextDouble();
        omumi = s.nextDouble();
        programming = s.nextDouble();

        double avg = (physics1 * 3 + math1 * 4 +
                mathWriting * 2 + omumi * 2 +
                programming * 4)/(3+4+2+2+4);

        System.out.println("Karname: ");
        System.out.println("----------------------------");
        System.out.println();

        System.out.print("Physics 1: " + physics1);
        if (physics1 < 10) {
            System.out.print(" Fail");
        }
        System.out.println();

        System.out.print("Math 1: " + math1);
        if (math1 < 10) {
            System.out.println(" Fail");
        }
        if (math1 >= 10) {
            System.out.println();
        }

        System.out.print("Math writing: " + mathWriting);
        if (mathWriting < 10) {
            System.out.println(" Fail");
        } else {
            System.out.println();
        }


        System.out.print("Omumi: " + omumi);
        if (omumi < 10) {
            System.out.println(" Fail");
        } else {
            System.out.println();
        }


        System.out.print("Programming: " + programming);
        if (programming < 10) {
            System.out.println(" Fail");
        } else {
            System.out.println();
        }

        System.out.println("----------------------------");
        System.out.println("Average: " + avg);

        if (avg < 10) {
            System.out.println("Failed Term");
        } else if (avg < 12) {
            System.out.println("Semi fail");
        } else if (avg < 16) {
            System.out.println("Be careful");
        } else if (avg == 20) {
            System.out.println("Excellent!");
        }

        if (avg < 10) {
            if (avg < 5)
                System.out.println(5);
        } else
            if (avg < 12)
                System.out.println("H");
            else
                System.out.println("K");


        if (!(avg == 20)) {
            System.out.println("If avg was 20, you would get an `Excellent'");
        }

    }
}
