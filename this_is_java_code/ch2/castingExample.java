package ch2;

public class castingExample {

	public static void main(String[] args) {

		int intValue = 44032;
		char charvalue = (char) intValue;
		System.out.println(charvalue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);

	}

}
