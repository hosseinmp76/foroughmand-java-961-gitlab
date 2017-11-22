public class World {

    private Robot[] robots;

    public World() {
    }

    public World(Robot[] r) {
        this.robots = r;
    }

    public void setRobots(Robot[] robots) {
        this.robots = robots;
    }

    public Robot getRobotByIndex(int i) {
        return robots[i];
    }


    //    public Robot theOtherRobot(Robot me) {
//        if (me == robot1) {
//            return robot2;
//        } else {
//            return robot1;
//        }
//    }
}
