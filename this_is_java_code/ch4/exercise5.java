package ch4;

public class exercise5 { // 방정식 4x + 5y = 60의 모든 해를 구한 후 출력하는 코드 

	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (((4 * x) + (5 * y)) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
