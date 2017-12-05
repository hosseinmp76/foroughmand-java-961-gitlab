package bp96.wolf;

import bp96.wolf.animal.Animal;
import bp96.wolf.animal.Sheep;
import bp96.wolf.animal.Wolf;
import bp96.wolf.world.World;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        final int maxX = 4;
        final int maxY = 4;

        World world = new World(maxX, maxY);

        {
            int x = random.nextInt(maxX),
                    y = random.nextInt(maxY);
            Wolf wolf = new Wolf(world, x, y);
            world.addAnimal(wolf);
        }

        for (int i=0; i<10; i++) {
            int x = random.nextInt(maxX),
                    y = random.nextInt(maxY);
            if (world.isEmpty(x, y)) {
                Sheep sheep = new Sheep(world, x, y);
                world.addAnimal(sheep);
            }
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (int x=0; x<maxX; x++) {
                for (int y=0; y<maxY; y++) {
                    Animal a = world.get(x, y);
                    if (a != null) {
                        a.step();
                    }
                }
            }

            world.print();
            scanner.nextLine();
        }













    }
}
