package study;

import java.util.Scanner;

public class Backjoon1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//판매 대수에 상관없이 매년 들어가는 비용이 A
		int a = sc.nextInt();
		//노트북을 한대 생산하는 비용이 B
		int b = sc.nextInt();
		//노트북 한대의 가격은 C
		int c = sc.nextInt();
		
		//노트북 한대를 생산하는 비용이 판매가격이랑 같거나 큰경우 이득이 발생할 수 없음
		if (b>=c) {
			System.out.println(-1);
		}else {
			//고정비용을 순이득으로 다 채운 후에 이익을 볼 수 있음!
			System.out.println((a/(c-b))+1);
		}
		
		
	}
}
