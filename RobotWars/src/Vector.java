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

    public double size() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector multiplyTo(double v) {
        return new Vector((int)(x * v), (int)(y * v));
    }
}
