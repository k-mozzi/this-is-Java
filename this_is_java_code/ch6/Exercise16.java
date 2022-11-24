package ch6;

class Printer {
	void println(int num) {
		System.out.println(num);
	}
	void println(boolean tf) {
		System.out.println(tf);
	}
	void println(double likeF) {
		System.out.println(likeF);
	}
	void println(String word) {
		System.out.println(word);
	}
}

public class Exercise16 {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
