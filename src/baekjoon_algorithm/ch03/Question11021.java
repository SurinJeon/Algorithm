package baekjoon_algorithm.ch03;

import java.util.Scanner;

public class Question11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int a = 0;
		int b = 0;

		for (int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.printf("Case #%d: %d + %d = %d%n", i + 1, a, b, a + b);
		}

		sc.close();

	}

}
