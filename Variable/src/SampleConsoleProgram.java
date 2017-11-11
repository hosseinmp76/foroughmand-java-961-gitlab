public class SampleConsoleProgram {

    public static void main(String[] args) {
        System.out.println("Enter two integers:");

        int a, b, c = 0;
        java.util.Scanner s = new java.util.Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();
        a = s.nextInt();

        int sum = a + b + c;

        System.out.println("Sum = " + sum);
    }
}
