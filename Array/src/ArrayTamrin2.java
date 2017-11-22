import java.util.Scanner;

public class ArrayTamrin2 {

    public static void main(String[] args) {

        int[] a = new int[0];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; ; i++) {
            int x = scanner.nextInt();
            if (x == -1) {
                break;
            }
            int[] b = new int[i+1];
            b[i] = x;
            for (int j=0; j<i; j++) {
                b[j] = a[j];
            }
            a = b;
        }

        // Do the rest

        System.out.println(a.length);
    }
}
