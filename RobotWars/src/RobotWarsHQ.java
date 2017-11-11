import java.util.Scanner;

public class RobotWarsHQ {

    public static void main(String[] args) {

        World world = new World();

        Robot r1 = new Robot(world, new Point(0, 0), "Ali",
                new Wheel(100), new Gun(100)),
            r2 = new Robot(world, new Point(1, 1), "Alex",
                    new Wheel(100), new Gun(100));

        world.setRobot1(r1);
        world.setRobot2(r2);


        r1.printStatus();
        r2.printStatus();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ali's turn: ");
            String alisMove = scanner.next();
            r1.readAndDoAction(scanner);
            r1.printStatus();

            System.out.println("Alex's turn: ");
            String alexsMove = scanner.next();
            int alexsMoveLength = scanner.nextInt();
            r2.doAction(alexsMove, alexsMoveLength);
            r2.printStatus();
        }
    }
}
