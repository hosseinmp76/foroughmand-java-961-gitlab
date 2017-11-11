public class TamrinBaVariable {
    public static void main(String[] args) {
        int age = 18, ageMonths = 10, weight = 55;

        double heightInMeter = 1.75;

        System.out.println("Your health information:");

        System.out.println();
        System.out.println("Your age is: " + age + " years and " + ageMonths + " months");
        System.out.println("Your height is: " + heightInMeter);
        System.out.println("Your weight is: " + weight);

        double bmi = (weight)/(heightInMeter * heightInMeter);
        System.out.println("Your BMI is: " + bmi);

        double x = age  / (weight * 1.0);
        System.out.println("X is " + x);


        int big = Integer.MAX_VALUE;

        int bigger = big + 1;

        System.out.println("BIG = " + big + " and bigger is " + bigger);

        System.out.println("D = " + (-100 % 3));
    }
}
