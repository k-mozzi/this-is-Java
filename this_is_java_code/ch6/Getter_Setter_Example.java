package ch6;

class Getter_Setter {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}

	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}

public class Getter_Setter_Example {

	public static void main(String[] args) {

		Getter_Setter myCar = new Getter_Setter();

		myCar.setSpeed(-50);

		System.out.println("현재 속도: " + myCar.getSpeed());

		myCar.setSpeed(90);

		if (!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("현재 속도: " + myCar.getSpeed());

	}

}
