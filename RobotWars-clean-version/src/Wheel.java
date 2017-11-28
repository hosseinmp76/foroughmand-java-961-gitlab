public class Wheel {

	private int health;

	public Wheel(int health) {
		this.health = health;
	}

	public Point move(Point origin, Vector movement) {
		if (movement.size() > health) {
			System.err.println("Movement is big " + movement.toString() + " sz:" + movement.size());
			movement.scale(health * 1.0 / movement.size());
			System.err.println("Movement resized to " + movement.toString());
		}
		return origin.moveBy(movement);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void shooted(int strength) {
		health = Math.max(health - strength, 0);
	}

	public String toString() {
		return "h: " + health;
	}

	public void rest() {
		health += health / 10;
	}

	public boolean isDead() {
		return health == 0;
	}
}
