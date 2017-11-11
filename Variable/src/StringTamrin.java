import java.util.Scanner;

public class StringTamrin {

    public static void main(String[] args) {
        String s = "Salaam!";

//        System.out.println("length of '" + s + "' is " + s.length());
//
        System.out.println("s.charAt(2) is: " + s.charAt(2));

        String b = "asdflkjsad;flkj";
        char c = 'a';

        for (int i=0; i < s.length(); i++) {
            char x = s.charAt(i);
            System.out.println(x);
        }

        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();


        String line = scanner.nextLine();

        System.out.println("x.length()=" + x.length() + ", line.length() = " + line.length());
    }
}
