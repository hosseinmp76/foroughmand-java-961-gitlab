import java.util.Scanner;

public class Latin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

//        int[][] a = new int[n][n];
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                int x = scanner.nextInt();
//                a[i][j] = x;
//            }
//        }

        int[][]  a = {
                {1, 2, 3},
                {3, 1, 2},
                {2, 3, 1, 5},
        };

        boolean isLatin = true;
        //Test Rows
        for (int i=0; i<n; i++) {
            for (int k=0; k<n; k++) {
                boolean kIsPresent = false;
                for (int j=0; j<n; j++) {
                    if (a[i][j] == k+1) {
                        kIsPresent = true;
                    }
                }
                if (!kIsPresent) {
                    isLatin = false;
                }
            }
        }

        for (int j=0; j<n; j++) {
            for (int k=0; k<n; k++) {
                boolean kIsPresent = false;
                for (int i=0; i<n; i++) {
                    if (a[i][j] == k+1) {
                        kIsPresent = true;
                    }
                }
                if (!kIsPresent) {
                    isLatin = false;
                }
            }
        }

        if (isLatin) {
            System.out.println("Latin");
        } else {
            System.out.println("not Latin");
        }
    }
}
