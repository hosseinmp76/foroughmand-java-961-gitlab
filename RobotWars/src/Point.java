public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public Point moveInDirection(Vector direction) {
        return new Point(x + direction.getX(),
                y + direction.getY());
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }


    public double distance(Point b) {
        return Math.sqrt((x - b.getX())*(x - b.getX()) +
                (y - b.getY())*(y - b.getY()));
    }
}







