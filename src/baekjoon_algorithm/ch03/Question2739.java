package baekjoon_algorithm.ch03;

import java.util.Scanner;

public class Question2739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d%n", n, i, n * i);
		}
		
		sc.close();
	}
	
}
