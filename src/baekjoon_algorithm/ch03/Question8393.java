package baekjoon_algorithm.ch03;

import java.util.Scanner;

public class Question8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n + 1; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);

		sc.close();
		
	}

}
