package bp96.wolf.animal;

import bp96.wolf.world.World;

import java.awt.*;
import java.util.Random;


public class Wolf extends Animal {
    private Random random = new Random();

    public Wolf(World world, int x, int y) {
        super(world, x, y);
    }

    public void step() {
        int dx = random.nextInt(3) - 1,
                dy = random.nextInt(3) - 1;
        int nx = getX() + dx, ny = getY() + dy;
        if (world.isValid(nx, ny)) {
            if (!world.isEmpty(nx, ny)) {
                Animal a = world.get(nx, ny);
                if (a instanceof Sheep){
                    Sheep sheep = ((Sheep) a);
                    sheep.die();

                    world.set(getX(), getY(), null);
                    setX(nx);
                    setY(ny);
                    world.set(getX(), getY(), this);
                }
                //EAT
            } else {
                world.set(getX(), getY(), null);
                setX(nx);
                setY(ny);
                world.set(getX(), getY(), this);
            }
        }

    }

    public String toString() {
        return "W";
    }








}
