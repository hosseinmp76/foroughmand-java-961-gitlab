import java.util.Scanner;

// برای محاسبه معادله
public class Polynomial {

    public static void main(String[] args) {
        // اين متغير برای خواندن از ورودی است.
        Scanner s = new Scanner(System.in); // ادامه خط خوانده نمي شود

        /*
        ;alkfdsj ;lakjfds laskfd
        ;ajsdf joiasfd
        ;lkjnpiurew
        asfd
         */

        double a = s.nextDouble(),
                b = s.nextDouble(),
                c = s.nextDouble(),
                d = s.nextDouble();

        String ans = "yes";

        while (!ans.equals("no")) {
            double x = s.nextDouble();

            double fx = a * x * x * x +
                    b * x * x +
                    c * x +
                    d;

            System.out.println("f(" + x + ") = " + fx);

            System.out.println("Do you want to continue? (yes/no)");
            ans = s.next();
        }


    }
}
