import java.util.Scanner;

public class PolynomialRoot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // ادامه خط خوانده نمي شود

        double a = s.nextDouble(),
                b = s.nextDouble(),
                c = s.nextDouble(),
                d = s.nextDouble();

        double x1, x2;

        x1 = s.nextDouble();
        x2 = s.nextDouble();

        while (x2 - x1 > 0) {
            // x1 < x2
            // f(x1) < 0
            // f(x2) > 0
            System.out.println("x1="+x1 + " x2="+x2);

            double xm = (x1 + x2)/ 2;
            double fxm = a * xm * xm * xm +
                    b * xm * xm +
                    c * xm + d;
            if (fxm == 0) {
                x1 = xm;
                x2 = xm;
            } else if (fxm < 0) {
                x1 = xm;
            } else {
                x2 = xm;
            }
        }

        double fx1 = a * x1 * x1 * x1 +
                b * x1 * x1 +
                c * x1 + d;

        System.out.println("f(" + x1 + ") = " + fx1);

    }
}
