package baekjoon_algorithm.ch03;

import java.util.ArrayList;
import java.util.Scanner;

public class Question10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			intList.add(a);
		}

		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) < x) {
				System.out.printf(intList.get(i) + " ");
			}
		}

		sc.close();

	}

}
