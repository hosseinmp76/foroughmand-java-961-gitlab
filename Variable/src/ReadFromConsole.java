public class ReadFromConsole {

    public static void main(String[] args) {
        java.util.Scanner reza = new java.util.Scanner(System.in);

        int i;

        System.out.println("Ye adad sahih bede");
        i = reza.nextInt();

        double d;

        System.out.println("Ye adad double bede");
        d = reza.nextDouble();

        System.out.println("i = " + i + " & d = " + d);
    }
}
