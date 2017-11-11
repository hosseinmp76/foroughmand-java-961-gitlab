public class World {

    private Robot robot1;
    private Robot robot2;

    public World() {
    }

    public World(Robot robot1, Robot robot2) {
        this.robot1 = robot1;
        this.robot2 = robot2;
    }

    public Robot getRobot1() {
        return robot1;
    }

    public void setRobot1(Robot robot1) {
        this.robot1 = robot1;
    }

    public Robot getRobot2() {
        return robot2;
    }

    public void setRobot2(Robot robot2) {
        this.robot2 = robot2;
    }

    public Robot theOtherRobot(Robot me) {
        if (me == robot1) {
            return robot2;
        } else {
            return robot1;
        }
    }
}
