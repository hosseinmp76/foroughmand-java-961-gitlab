import java.util.Scanner;

public class ArrayTamrin1 {

    public static void main(String[] args) {

        System.out.println("How many numbers?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for (;;) {
            System.out.println("Enter a number to evaluate");
            int x = scanner.nextInt();
            int count = 0;
            for (int i=0; i<n; i++) {
                if (a[i] == x) {
                    count++;
                }
            }
            System.out.println("Number " + x + " appears " +
                count + " time(s) in first input");
        }
    }
}
