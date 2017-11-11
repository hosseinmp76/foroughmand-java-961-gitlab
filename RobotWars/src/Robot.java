import java.util.Scanner;

public class Robot {

    private Point location;
    private String name;
    private Wheel wheel;
    private Gun gun;
    private World world;

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
                " @" + location.toString());
    }

    public void move(Vector direction) {
//        location.set(location.getX() + direction.getX(),
//                location.getY() + direction.getY());
//
        location = wheel.moveRobot(location, direction);
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void readAndDoAction(Scanner scanner) {
        String action = scanner.next();
        if (action.equals("u") || action.equals("d") ||
                action.equals("l") || action.equals("r")) {
            int length = scanner.nextInt();
            if (action.equals("u")) {
                move(new Vector(0, length));
            } else if (action.equals("d")) {
                move(new Vector(0, -length));
            } else if (action.equals("r")) {
                move(new Vector(length, 0));
            } else if (action.equals("l")) {
                move(new Vector(-length, 0));
            }
        } else {
            if (action.equals("sw")) {
                Robot otherRobot = world.theOtherRobot(this);
                Wheel otherRobotsWheel = otherRobot.getWheel();
                gun.shootToWheel(otherRobotsWheel);
            } else if (action.equals("sg")) {
                Robot otherRobot = world.theOtherRobot(this);
                Gun otherRobotsGun = otherRobot.getGun();
                gun.shootToGun(otherRobotsGun);
            }
        }
    }
}
