package bp96.wolf;

import bp96.wolf.animal.Sheep;
import bp96.wolf.animal.Wolf;
import bp96.wolf.world.World;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		World world = new World(10, 10);
		Random random = new Random();

		for (int i=0; i<10; i++) {
			int x = random.nextInt(10),
					y = random.nextInt(10);
			if (world.isFree(x, y)) {
				new Sheep(world, x, y);
			}
		}
		while (true) {
			int x = random.nextInt(10),
					y = random.nextInt(10);
			if (world.isFree(x, y)) {
				new Wolf(world, x, y);
				break;
			}
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			world.act();
			world.print();
			sc.nextLine();
		}
	}
}
