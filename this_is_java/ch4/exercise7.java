package ch4;

public class exercise7 {

	public static void main(String[] args) throws Exception { // 키보드 입력에 따라 기능을 수행하는 코드

		boolean run = true;

		int balance = 0;

		while (run) {
			if (balance != 13 && balance != 10) {
				System.out.println("----------");
				System.out.println("1: 예금 | 2: 출금 | 3: 잔금 | 4: 종료");
				System.out.println("----------");
				System.out.print("선택> ");
			}

			balance = System.in.read();

			if (balance == 49) { // 1을 읽었을 경우
				System.out.println("예금액: 10000");
			} else if (balance == 50) { // 2를 읽었을 경우
				System.out.println("출금액: 2000");
			} else if (balance == 51) { // 3을 읽었을 경우
				System.out.println("잔금: 8000");
			} else if (balance == 52) { // 4를 읽었을 경우
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}

}
