import java.util.Scanner;

public class Robot {

	private String name;
	private Wheel wheel;
	private World world;
	private Gun gun;
	private Point location;

	public Robot(String name, Wheel wheel, World world, Gun gun, Point location) {
		this.name = name;
		this.wheel = wheel;
		this.world = world;
		this.gun = gun;
		this.location = location;
	}

	public void readAndAct(Scanner scanner) {
		System.out.println("Enter " + name + "'s move");
		String action = scanner.next();
		if (action.equals("gu") || action.equals("gd") || action.equals("gr") || action.equals("gl")) {
			int amount = scanner.nextInt();
			if (action.equals("gu")) {
				location = wheel.move(location, new Vector(0, amount));
			} else if (action.equals("gd")) {
				location = wheel.move(location, new Vector(0, -amount));
			} else if (action.equals("gr")) {
				location = wheel.move(location, new Vector(amount, 0));
			} else if (action.equals("gl")) {
				location = wheel.move(location, new Vector(-amount, 0));
			}
		} else if (action.equals("sg") || action.equals("sw")) {
			Robot otherRobot = world.getOtherRobot(this);
			if (location.distance(otherRobot.getLocation()) < gun.getRange()) {
				if (action.equals("sg")) {
					gun.shootTo(otherRobot.getGun());
				} else if (action.equals("sw")) {
					gun.shootTo(otherRobot.getWheel());
				}
			}
		} else if (action.equals("rest")) {
			wheel.rest();
			gun.rest();
		}
	}

	public Wheel getWheel() {
		return wheel;
	}

	public Gun getGun() {
		return gun;
	}

	public Point getLocation() {
		return location;
	}

	public String toString() {
		return "Robot: " + name + " @" + location.toString() + " Gun: " + gun.toString() + " Wheel: " + wheel.toString();
	}

	public boolean isDead() {
		return wheel.isDead();
	}

	public String getName() {
		return name;
	}
}
