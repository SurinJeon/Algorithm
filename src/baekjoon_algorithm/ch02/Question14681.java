package baekjoon_algorithm.ch02;

import java.util.Scanner;

public class Question14681 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	
		int b = sc.nextInt();	
		
		int quadrant;
		
		if(a > 0 && b > 0) {
			quadrant = 1;
		}else if(a < 0 && b > 0) {
			quadrant = 2;
		}else if(a < 0 && b < 0) {
			quadrant = 3;
		}else {
			quadrant = 4;
		}
		
		System.out.println(quadrant);
	
		sc.close();
	}
	
}

