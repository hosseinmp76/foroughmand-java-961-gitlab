import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        for (int j = 2; j<= m; j++) {
            boolean tHMSMA = false;
            for (int t = ((int) (Math.sqrt(j))); t > 1; t--) {
                if (j % t == 0) {
                    tHMSMA = true;
                    break;
                }
            }
            if (!tHMSMA)
                System.out.println(j);
//            boolean b = j <= m;
        }
    }
}
