package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt(); //고정비용
		long b = sc.nextInt(); //가변비용
		long c = sc.nextInt(); //판매가격
		
		long x = 1; //생산량
		
		//판매이득이 생산비용보다 많아지는 순간에 출력
		while (a+(b*x) >= c*x) {	
			//판매가격이 하나 만드는 가격보다 못하거나 같으면
			//손익분기점이 안생겨버림
			if (b >= c) {
				x = -1;
				break;
			}
			x += 1;
		}
		
		System.out.println(x);
		
	}
}
