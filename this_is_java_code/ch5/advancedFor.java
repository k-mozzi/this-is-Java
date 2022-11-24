package ch5;

public class advancedFor {

	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) {
			sum += score;
			System.out.println(score);
			System.out.println(sum);
			System.out.println();
		}
		System.out.println("sum of score: " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("avg of score: " + avg);
	}

}
