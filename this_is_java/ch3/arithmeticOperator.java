package ch3;

public class arithmeticOperator {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;

		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);

		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);

		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);

		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);

		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);

		double result6 = (double) v1 / v2;
		System.out.println("result6 = " + result6);
		// 실수값을 산출 결과로 얻고 싶으면 피연산자 중 최소한 하나는 실수 타입이어야 한다.
		
		System.out.println(4.0 % 0);

	}

}
