package study;

import java.util.Scanner;

public class Backjoon2292 {

	public static void main(String[] args) {

		//1 ~ 1
		//2 ~ 7
		//8 ~ 19
		//20 ~ 37
		//38 ~ 61
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long x = 2;
		long y = 7;
		
		
		if (n == 1) {
			System.out.println(1);
		}
		
		if (n >= 2  && n <= 7) {
			System.out.println(2);
		
		//1, 2~7 까지의 경우를 제외하고 계산했다.
		}else {
			
			for (long i = 1; i < n; i++) {
				x += 6*i;
				y += 6*(i+1); 
				if (n >= x && n <= y) {
					System.out.println(i+2);
					break;
				}
			}
				
		}
		
		
	}
}
