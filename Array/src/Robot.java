public class Robot {

    private int number;

    public Robot() {
    }

    public Robot(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

//    public boolean equals(Robot r) {
//        return number == r.getNumber();
//    }

    public String toString() {
        return "R: [" + number + "]";
    }

    public boolean equals(Robot robot) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Robot robot = (Robot) o;
//
        if (robot == null) {
            return false;
        }
        return number == robot.number;
    }

    public void changeInteger(int x) {
        x = 2;
    }

    public Robot getNewNextRobot() {
        return new Robot(number + 1);
    }

    public void changeRobot(Robot r) {
        r.setNumber(5);
    }

}
