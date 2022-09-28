package ch2;

public class operationExample {

	public static void main(String[] args) {

		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
//		byte bytevalue3 = bytevalue1 + bytevalue2;
// 		int형이 기본이므로 연산을 수행할 때 자동으로 int 타입으로 변환되 컴파일 오류 발생 
		int intvalue1 = bytevalue1 + bytevalue2;
		System.out.println(intvalue1);

		char charvalue1 = 'A';
		char charvalue2 = 1;
//		char charValue3 = charvalue1 + charvalue2;
//		char 타입을 연산할 땐 int형으로 변환되므로 컴파일 오류 발생 
		int intValue2 = charvalue1 + charvalue2;
		System.out.println("유니코드= " + intValue2);
		System.out.println("출력문자= " + (char) intValue2);

	}

}
