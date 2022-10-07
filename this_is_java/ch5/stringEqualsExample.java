package ch5;

public class stringEqualsExample {

	public static void main(String[] args) {

		String a = "KKM";
		String b = "KKM";

		if (a == b) {
			System.out.println("a와 b는 참조가 같음");
		} else {
			System.out.println("a와 b는 참조가 다름");
		}

		if (a.equals(b)) {
			System.out.println("a와 b는 문자열이 같음");
		}

		String c = new String("KKM");
		String d = new String("KKM");

		if (c == d) {
			System.out.println("a와 b는 참조가 같음");
		} else {
			System.out.println("a와 b는 참조가 다름");
		}

		if (c.equals(d)) {
			System.out.println("a와 b는 문자열이 같음");
		}

	}

}
