package ch4;

public class ifDiceExample {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
		// 0.0 이상 1.0 미만의 난수를 생성하는 함수

		if (num == 1) {
			System.out.println("1번");
		}
		if (num == 2) {
			System.out.println("2번");
		}
		if (num == 3) {
			System.out.println("3번");
		}
		if (num == 4) {
			System.out.println("4번");
		}
		if (num == 5) {
			System.out.println("5번");
		}
		if (num == 6) {
			System.out.println("6번");
		}

	}

}
