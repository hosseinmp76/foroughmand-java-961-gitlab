public class Wheel {

    private int health;

    public Wheel(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Point moveRobot(Point robotCurrentLocation,
                           Vector direction) {
        double sz = direction.size();
        if (sz > health) {
            direction = direction.multiplyTo(health/sz);
        }
        return robotCurrentLocation.moveInDirection(direction);
    }
}
