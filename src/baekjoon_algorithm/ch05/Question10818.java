package baekjoon_algorithm.ch05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Question10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			intList.add(x);

		}

		Comparator<Integer> compInt = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				} else {
					return -1;
				}

			}
		};

		intList.sort(compInt);

		System.out.print(intList.get(0) + " ");
		System.out.println(intList.get(intList.size() - 1));

		sc.close();

	}

}
