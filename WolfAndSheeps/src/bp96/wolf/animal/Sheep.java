package bp96.wolf.animal;

import bp96.wolf.world.World;

import java.util.Random;

public class Sheep extends Animal {

	private Random random = new Random();

	public Sheep(World world, int x, int y) {
		super(world, x, y);
	}

	@Override
	public void act() {
		moveIfFree(random.nextInt(3)-1, random.nextInt(3)-1);
	}


	public void die() {
		getWorld().put(getX(), getY(), null);
	}

	@Override
	public String toString() {
		return "S";
	}
}
