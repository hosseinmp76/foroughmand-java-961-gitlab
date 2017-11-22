import java.util.Scanner;

public class RobotWarsHQ {

    public static void main(String[] args) {

//        System.out.println("This is a game with shoot distance="+
//                Robot.getShootDistance());

        World world = new World();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many robots?");
        int n = scanner.nextInt();

        Robot[] r = new Robot[n];
        for (int i=0; i<n; i++) {
            r[i] = new Robot(world, new Point(i, i), "Robot-"+i, new Wheel(100),
                    new Gun(100));
        }
//        Robot r1 = new Robot(world, new Point(0, 0), "Ali",
//                new Wheel(100), new Gun(100)),
//            r2 = new Robot(world, new Point(1, 1), "Alex",
//                    new Wheel(100), new Gun(100));

//        world.setRobot1(r1);
//        world.setRobot2(r2);
        world.setRobots(r);

//        r1.printStatus();
//        r2.printStatus();
//
//        r1.getWheel().setHealth(10);

        while (true) {
            for (int i=0; i<n; i++) {
                if (!r[i].isDead()) {
                    System.out.println("Robot: " + r[i].getName() + "'s Turn");
                    r[i].readAndDoAction(scanner);
                    ;
                }
            }

            int liveCount = 0;
            for (int i=0; i<n; i++) {
                if (!r[i].isDead()) {
                    liveCount++;
                }
            }
            if (liveCount <= 1) {
                break;
            }



//            System.out.println("Ali's turn: ");
//            r1.readAndDoAction(scanner);
//            r1.printStatus();
//            if (r2.isDead()) {
//                System.out.println("Ali won the game.");
//                break;
//            }
//
//            System.out.println("Alex's turn: ");
//            r2.readAndDoAction(scanner);
//            r2.printStatus();
        }
    }
}








