package bp96.wolf.world;

import bp96.wolf.animal.Animal;

public class World {

	private Animal[][] cells;

	public World(int maxX, int maxY) {
		cells = new Animal[maxX][maxY];
	}

	public boolean isFree(int x, int y) {
		return isValid(x, y) && cells[x][y] == null;
	}

	public void put(int x, int y, Animal animal) {
		cells[x][y] = animal;
	}

	public Animal get(int x, int y) {
		return cells[x][y];
	}

	public boolean isValid(int x, int y) {
		return 0 <= x && x < cells.length && 0 <= y && y < cells[0].length;
	}

	public void print() {
		for (Animal[] row: cells
			 ) {
			for (Animal a: row
				 ) {
				if (a == null) {
					System.out.print(" ");
				} else {
					System.out.print(a.toString());
				}
			}
			System.out.println();
		}
	}

	public void act() {
		for (Animal[] row: cells
				) {
			for (Animal a: row
					) {
				if (a != null)
					a.act();
			}
		}
	}
}
