package bp96.wolf.animal;

import bp96.wolf.world.World;

import java.util.Random;

public class Wolf extends Animal {

	private Random random = new Random();

	public Wolf(World world, int x, int y) {
		super(world, x, y);
	}

	@Override
	public void act() {
		int dx = random.nextInt(3)-1, dy = random.nextInt(3)-1, nx = getX() + dx, ny = getY() + dy;
		if (getWorld().isValid(nx, ny) && !getWorld().isFree(nx, ny) && getWorld().get(nx, ny) instanceof Sheep) {
			((Sheep)getWorld().get(nx, ny)).die();
		}
		moveIfFree(dx, dy);
	}

	@Override
	public String toString() {
		return "W";
	}
}
