public class Fibonacci {

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();

        int a = 1, b = 1;
        int i = 0;
        while (i+1 < n) {
            int futureB = b + a;
            a = b;
            b = futureB;
            i = i + 1;
        }

        System.out.print(n);

        if (n%10 == 1 && n%100 != 11) {
            System.out.print("st");
        } else if (n%10 == 2 && n%100 != 12) {
            System.out.print("nd");
        } else if (n%10 == 3 && n%100 != 13) {
            System.out.print("rd");
        } else {
            System.out.print("th");
        }

        System.out.println(" Fibonacci number is " + a);
    }
}
