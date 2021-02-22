package baekjoon_algorithm.ch05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Question2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> intList1 = new ArrayList<Integer>();

		int x;

		for (int i = 0; i < 9; i++) {
			x = sc.nextInt();
			intList1.add(x);
		}

		ArrayList<Integer> intList2 = intList1;

		Comparator<Integer> compInt = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1 - o2;
			}
		};

		intList2.sort(compInt);

		for (int j = 0; j < intList1.size(); j++) {
			if (intList1.get(j).equals(intList2.get(intList2.size() - 1))) {
				System.out.println(intList1.get(j));
				System.out.println(j);
			}
		}
		
		sc.close();

	}

}
