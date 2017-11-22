import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = scanner.nextInt();
//        int[] a = new int[n];
//        for (int i=0; i<n; i++) {
//            a[i] = scanner.nextInt();
//        }
//        int[] a = new int[5];
//        a[0] = 10;
//        a[1] = 5;
//        a[2] = 1;
//        a[3] = 3;
//        a[4] = 2;
        int[] a = {10, 5, 1, 3, 2};

        int n = 5;

        //Sort

        for (int i=0; i<n; i++) {

            int candidatePo = i;
            for (int j=i; j<n; j++) {
                if (a[j] < a[candidatePo]) {
                    candidatePo = j;
                }
            }

            int t = a[candidatePo];
            a[candidatePo] = a[i];
            a[i] = t;

            System.err.println("Step " + i + ":");
            for (int j=0; j<n; j++) {
                System.err.print(a[j] + " ");
            }
            System.err.println();

        }


//        System.out.println("Min = " + a[candidatePo]);


        System.out.println("Sorted integers:");
        for (int j=0; j<n; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();

    }
}
