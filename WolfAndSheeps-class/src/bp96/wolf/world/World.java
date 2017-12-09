package bp96.wolf.world;

import bp96.wolf.animal.Animal;
import bp96.wolf.animal.Sheep;
import bp96.wolf.animal.Wolf;

public class World {
    private int maxX;
    private int maxY;
    private Animal[][] cells;

    public World(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        cells = new Animal[maxX][maxY];
    }

    public boolean isEmpty(int x, int y) {
        return cells[x][y] == null;
    }

    public boolean isValid(int x, int y) {
        return 0 <= x && x < maxX && 0 <= y && y < maxY;
    }

    public void addAnimal(Animal animal) {
        cells[animal.getX()][animal.getY()] = animal;
    }

//    public void addSheep(Sheep sheep) {
//        cells[sheep.getX()][sheep.getY()] = sheep;
//    }
//
//    public void addWolf(Wolf wolf) {
//        cells[wolf.getX()][wolf.getY()] = wolf;
//    }

    public Animal get(int x, int y) {
        return cells[x][y];
    }

    public void set(int x, int y, Animal animal) {
        cells[x][y] = animal;
    }

    public void print() {

        for (int x=0; x<maxX; x++) {
            for (int y=0; y<maxY; y++) {
                Animal a = get(x, y);
                if (a != null) {
                    System.out.print(a.toString());
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
