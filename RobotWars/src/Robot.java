import java.util.Scanner;

public class Robot {

    private Point location;
    private String name;
    private Wheel wheel;
    private Gun gun;
    private World world;

    public static final String UP_ACTION = "u";
    public static final int SHOOT_DISTANCE = 100;

    public Robot(World world, Point location, String name, Wheel wheel,
                 Gun gun) {
        this.world = world;
        this.location = location;
        this.name = name;
        this.wheel = wheel;
        this.gun = gun;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStatus() {
        System.out.println("Name: " + name +
                " @" + location.toString() + " gun: " +gun.toString() + " wheel: " + wheel.toString());
    }

    public void move(Vector direction) {
//        location.set(location.getX() + direction.getX(),
//                location.getY() + direction.getY());
//
        location = wheel.moveRobot(location, direction);
    }

    public Gun getGun() {
        return gun;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void readAndDoAction(Scanner scanner) {

        String action = scanner.next();
        if (action.equals(UP_ACTION) || action.equals("d") ||
                action.equals("l") || action.equals("r")) {
            int length = scanner.nextInt();
            if (action.equals(UP_ACTION)) {
                move(new Vector(0, length));
            } else if (action.equals("d")) {
                move(new Vector(0, -length));
            } else if (action.equals("r")) {
                move(new Vector(length, 0));
            } else if (action.equals("l")) {
                move(new Vector(-length, 0));
            }
        } else {
            int otherRobotIndex = scanner.nextInt();
            Robot otherRobot = world.getRobotByIndex(otherRobotIndex);
            if (action.equals("sw")) {
                Wheel otherRobotsWheel = otherRobot.getWheel();
                if (location.distance(otherRobot.getLocation()) < SHOOT_DISTANCE) {
                    gun.shootToWheel(otherRobotsWheel);
                }
            } else if (action.equals("sg")) {
                Gun otherRobotsGun = otherRobot.getGun();
                if (location.distance(otherRobot.getLocation()) < SHOOT_DISTANCE) {
                    gun.shootToGun(otherRobotsGun);
                }
            }
        }
    }

    public boolean isDead() {
        return wheel.getHealth() == 0;
    }
}
