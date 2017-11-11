public class Vector {

	private int x;
	private int y;

	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int size() {
		return (int)Math.sqrt(x * 1.0 * x + y* 1.0* y);
	}

	public void scale(double s) {
		System.err.print("Scale " + this + " with " + s + " ");
		x = (int)(x * s);
		y = (int)(y * s);
		System.err.println(" to " + this);
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
