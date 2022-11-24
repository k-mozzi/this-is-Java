package ch6;

class Printer2 {
	static void println(int num) {
		System.out.println(num);
	}
	static void println(boolean tf) {
		System.out.println(tf);
	}
	static void println(double likeF) {
		System.out.println(likeF);
	}
	static void println(String word) {
		System.out.println(word);
	}
}

public class Exercise17 {

	public static void main(String[] args) {
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("홍길동");
	}

}
