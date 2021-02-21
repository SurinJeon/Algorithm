package baekjoon_algorithm.ch01;

import java.util.Scanner;

public class Question2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int c = (b % 10);
		int d = ((b % 100) - c);
		int e = ((b % 1000) - c -d);
				
		System.out.println(a * c);
		System.out.println(a * d / 10);
		System.out.println(a * e / 100);
		
		System.out.println(a * b);
		
		sc.close();
	}

}
