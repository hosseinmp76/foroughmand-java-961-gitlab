public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
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

	public Point moveBy(Vector movement) {
		return new Point(x + movement.getX(), y + movement.getY());
	}

	public int distance(Point location) {
		return (int)Math.sqrt((location.getX() - x) * (location.getX() - x) + (location.getY() - y) * (location.getY() - y));
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
