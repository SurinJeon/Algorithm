package baekjoon_algorithm.ch03;

import java.util.Scanner;

public class Question10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i; 
		for(i = 0 ; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
		
	}

}
