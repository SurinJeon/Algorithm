package baekjoon_algorithm.ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		ArrayList<Integer> scoreList = new ArrayList<Integer>();

		for (int i = 0; i < c; i++) {

			int num = sc.nextInt();
			int std = 0; // 평균 넘는 학생 수

			for (int j = 0; j < num; j++) {

				int score = sc.nextInt();
				scoreList.add(score);

			}

			float avg = getAverage(scoreList);

			for (int k = 0; k < scoreList.size(); k++) {

				if (scoreList.get(k) < avg) {
					continue;
				} else if (scoreList.get(k) > avg) {
					std++;
				}

			}

			String per = String.format("%.3f", (float) (std * 100) / num);
			System.out.println(per + "%");

			scoreList.clear();

		}

	}

	private static float getAverage(ArrayList<Integer> scoreList) {
		int sum = 0;
		for (int i = 0; i < scoreList.size(); i++) {
			sum = sum + scoreList.get(i);
		}
		return sum / scoreList.size();
	}

}
