package baekjoon_algorithm.ch03;

import java.util.Scanner;

public class Question2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {

			for (int j = 0; j < n; j++) {

				if (j < n - i) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}

			}

			System.out.println();

		}

		sc.close();
	}

}
