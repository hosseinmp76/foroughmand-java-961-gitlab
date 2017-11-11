public class Log {

    public static void main(String[] args) {
        int n = 0;
        java.util.Scanner s = new java.util.Scanner(System.in);
        n = s.nextInt();

        int i = 1, powerOfI = 0;
        while (n > i) {
            i = i * 2;
            powerOfI = powerOfI + 1;
        }

        System.out.println(i + " = 2^" + powerOfI);

    }
}
