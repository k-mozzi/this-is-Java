package ch4;

public class elseIfExample {

	public static void main(String[] args) {

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80보다 큽니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 70보다 큽니다.");
			System.out.println("등급은 c 입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D 입니다.");
		}

	}

}
