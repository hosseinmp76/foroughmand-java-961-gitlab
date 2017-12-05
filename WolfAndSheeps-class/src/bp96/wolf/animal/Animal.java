package bp96.wolf.animal;

import bp96.wolf.world.World;

import java.util.Random;

public abstract class Animal {

    private int x;
    private int y;
    private Random random = new Random();
    protected World world;

    public Animal(World world, int x, int y) {
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public void moveToRandomNeighbor() {
        int dx = random.nextInt(3) - 1,
                dy = random.nextInt(3) - 1;
        int nx = x + dx, ny = y + dy;
        if (world.isValid(nx, ny) && world.isEmpty(nx, ny)) {
            world.set(x, y, null);
            x = nx;
            y = ny;
            world.set(x, y, this);
        }
    }

    public abstract void step();

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
}
