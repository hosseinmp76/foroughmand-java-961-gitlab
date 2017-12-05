package bp96.wolf.animal;

import bp96.wolf.world.World;

public abstract class Animal {

	private World world;
	private int x;
	private int y;

	public Animal(World world, int x, int y) {
		this.world = world;
		this.x = x;
		this.y = y;
		world.put(x, y, this);
	}

	protected void moveIfFree(int dx, int dy) {
		world.put(x, y, null);
		if (world.isFree(x + dx , y + dy)) {
			x += dx;
			y += dy;
		}
		world.put(x, y, this);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected World getWorld() {
		return world;
	}

	public abstract void act();

}
