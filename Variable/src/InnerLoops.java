import java.util.Scanner;

public class InnerLoops {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //int n = s.nextInt();

        int r = 20;

        int j = 0;
        while (j < r) {
            double l = Math.sqrt(r*r - j*j);
            int i = 0;
            while (i <= l-1) {
                System.out.print("..");
                i = i + 1;
            }
            System.out.println();
            j = j + 1;
        }

    }

}
