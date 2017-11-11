public class TamrinBaWhile3 {

    public static void main(String[] args) {
        int n, k, r;
        java.util.Scanner s = new java.util.Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        r = s.nextInt();

        int i;
        if (r == 0) {
            i = k;
        } else {
            i = r;
        }
        while (i <= n) {
            System.out.print(i + " ");
            i = i + k;
        }
        System.out.println();

    }
}
