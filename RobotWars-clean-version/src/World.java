public class World {

	private Robot robot1;
	private Robot robot2;

	public void set(Robot r1, Robot r2) {
		this.robot1 = r1;
		this.robot2 = r2;
	}


	public Robot getOtherRobot(Robot r) {
		if (r == robot1) {
			return robot2;
		}
		return robot1;
	}
}
