public class TamrinBaWhile {

    public static void main(String[] args)  {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();

        int p = 0;
        int sumAll = 0, sumOdd = 0, sumEven = 0;
        while (p < n) {
            int i = p+1;
            sumAll = sumAll + i;
            if (i % 2 != 0) {
                sumOdd = sumOdd + i;
            } else {
                sumEven = sumEven + i;
            }
            p = p + 1;
        }

        System.out.println("Sum of 1 to " + n + " = " + sumAll);
        System.out.println("Sum of odd numbers in 1 to " + n + " = " + sumOdd);
        System.out.println("Sum of even numbers in 1 to " + n + " = " + sumEven);

    }
}
