package ch6;

class StaticMember {
	static double pi = 3.141592;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}

public class StaticMemberExample {

	public static void main(String[] args) {

		double result1 = 10 * 10 * StaticMember.pi;
		int result2 = StaticMember.plus(10, 5);
		int result3 = StaticMember.minus(10, 5);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

	}

}
