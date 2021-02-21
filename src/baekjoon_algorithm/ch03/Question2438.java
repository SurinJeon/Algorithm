package baekjoon_algorithm.ch03;

import java.util.Scanner;

public class Question2438 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {

			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

		sc.close();

	}

}
