public class Gun {

    private int health;

    public Gun(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void shootToGun(Gun gun) {
        int newGunHealth = gun.getHealth() - health / 10;
        if (newGunHealth < 0)
            newGunHealth = 0;
        gun.setHealth(newGunHealth);
    }

    public void shootToWheel(Wheel wheel) {
        wheel.setHealth(Math.max(wheel.getHealth() - health / 10, 0));
    }

    public String toString() {
        return "h=" + health;
    }
}
