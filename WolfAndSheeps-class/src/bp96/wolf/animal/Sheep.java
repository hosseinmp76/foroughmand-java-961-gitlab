package bp96.wolf.animal;

import bp96.wolf.world.World;

public class Sheep extends Animal {


    public Sheep(World world, int x, int y) {
        super(world, x, y);
    }

    public void step() {
        moveToRandomNeighbor();
    }

    public void die() {
        world.set(getX(), getY(), null);
        System.out.println("Eh!");
    }

    public String toString() {
        return "S";
    }
}
