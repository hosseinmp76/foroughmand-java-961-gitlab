public class Gun {

	private int health;
	private int range;

	public Gun(int health, int range) {
		this.health = health;
		this.range = range;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void shootTo(Gun gun) {
		gun.shooted(health / 10);
	}

	private void shooted(int strength) {
		health = Math.max(0, health - strength);
	}

	public void shootTo(Wheel wheel) {
		wheel.shooted(health / 10);
	}

	public int getRange() {
		return range;
	}

	public String toString() {
		return "[h:" + health + " r:" + range + "]";
	}

	public void rest() {
		health += health / 10;
	}
}
