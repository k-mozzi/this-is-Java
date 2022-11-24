package ch4;

public class exercise3 { // 3의 배수 총합을 구하는 코드 

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
