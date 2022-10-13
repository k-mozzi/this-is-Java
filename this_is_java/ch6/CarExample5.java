package ch6;

class Car5 {
	int gas;

	void setGas(int gas) { // 굳이 메소드로 만들어서 값을 할당할 필요가 있나?
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("there is no gas");
			return false;
		} else {
			System.out.println("The gas is left");
			return true;
		}
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("run. (left gas: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("stop. (left gas: " + gas + ")");
				return;
			}

		}

	}
}

public class CarExample5 {

	public static void main(String[] args) {

		Car5 myCar = new Car5();

		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("go~");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("You don't have to refill the gas");
		} else {
			System.out.println("You have to refill the gas");
		}

	}

}
