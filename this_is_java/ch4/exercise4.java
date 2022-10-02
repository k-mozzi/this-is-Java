package ch4;

public class exercise4 { // 주사위 합이 5가 되면 출력하는 코드 

	public static void main(String[] args) {

		while (true) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			System.out.println("(" + a + ", " + b + ")");
			if (a + b == 5) {
				break;
			}
		}

	}

}
