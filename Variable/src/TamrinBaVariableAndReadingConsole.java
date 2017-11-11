public class TamrinBaVariableAndReadingConsole {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter your age: [year and month]");
        int age = scanner.nextInt();
        int ageMonths = scanner.nextInt();

        System.out.println("Enter your weight (in kg):");
        int weight = scanner.nextInt();

        System.out.println("Enter your height (in meters):");
        double heightInMeter = scanner.nextDouble();

        System.out.println("Your health information:");

        System.out.println();
        System.out.println("Your age is: " + age + " years and " + ageMonths + " months");
        System.out.println("Your height is: " + heightInMeter);
        System.out.println("Your weight is: " + weight);

        double bmi = (weight)/(heightInMeter * heightInMeter);
        System.out.println("Your BMI is: " + bmi);

        if (bmi >= 18.5) {
            System.out.println("نگران نباشید، شما سوء تغذیه ندارید");
        }

        if (bmi < 18.5) {
            System.out.println("لطفا بیشتر بخورید!");
        }

        if (bmi > 24) {
            System.out.println("لطفا کمتر بخورید!");
        }

        if (18.5 <= bmi) {
            if (bmi <= 24) {
                System.out.println("شما سالم هستید!");
            }
        }

        if (18.5 <= bmi && bmi <= 24) {
            System.out.println("شما سالم هستید!");

        }

        if (bmi < 18 || bmi > 24) {
            System.out.println("و به پزشک مراجعه کنید");
        }

        System.out.println("**********************");

    }
}
