public class TamrinBaWhile4 {

    public static void main(String[] args) {
        int n, k, r;
        java.util.Scanner s = new java.util.Scanner(System.in);

        n = s.nextInt();
        k = s.nextInt();
        r = s.nextInt();

        int firstNumberToPrint = 0;
        int i = 0;
        while (i < k && n - i >= 0) {
            if ((n - i)%k == r) {
                firstNumberToPrint = n - i;
            }
            i = i + 1;
        }

        while (firstNumberToPrint >= 1) {
            System.out.print(firstNumberToPrint + " ");
            firstNumberToPrint = firstNumberToPrint - k;
        }

        System.out.println();

    }
}
