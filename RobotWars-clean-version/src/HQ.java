import java.util.Scanner;

public class HQ {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		World world = new World();

		Robot r1 = new Robot("Ali", new Wheel(100), world, new Gun(100, 2), new Point(0, 0)),
				r2 = new Robot("Alex", new Wheel(100), world, new Gun(100, 2), new Point(1, 0));

		world.set(r1, r2);

		while (true) {
			r1.readAndAct(scanner);
			System.out.println("Status: " + r1.toString() + " " + r2.toString());
			if (r2.isDead()) {
				System.out.println("Robot " + r1.getName() + " won");
				break;
			}
			r2.readAndAct(scanner);
			System.out.println("Status: " + r1.toString() + " " + r2.toString());
			if (r1.isDead()) {
				System.out.println("Robot " + r2.getName() + " won");
				break;
			}
		}

	}
}
