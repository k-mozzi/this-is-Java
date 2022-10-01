package ch3;

public class stringEquals {

	public static void main(String[] args) {

		String strVar1 = "asd";
		String strVar2 = "asd";
		String strVar3 = new String("asd");

		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		// == 연산자는 값의 주소를 비교하므로 새로운 객체는 다른 주소를 갖는다.
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));

	}

}
