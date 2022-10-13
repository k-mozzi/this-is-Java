package ch6;

class Korean {
	String nation = "대한민국";
	String name;
	String ssn;

	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

public class koreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("kkm", "1234");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);

	}

}
