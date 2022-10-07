package ch5;

public class arrayCopyByMethod {

	public static void main(String[] args) {

		String[] oldStrArray = { "a", "b", "c" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 원본 배열, 원본 배열에서 복사할 항목의 시작 인덱스, 새 배열, 새 배열에서 붙여넣을 시작 인덱스, 복사할 개수 

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}

	}

}
