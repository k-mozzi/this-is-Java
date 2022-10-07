package ch5;

public class arrayInArray {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k > mathScores[i].length; k++) {
				System.out.println("mathScores{" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();

		// 값 할당하고 출력하는 코드는 생략 
		
	}

}
