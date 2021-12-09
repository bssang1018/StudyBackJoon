package study;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String A = "abcdefghijklmnopqrstuvwxyz";
		
		String S = scan.nextLine();
		
		int check = 0;
		
		
		/*
		S.charAt(j) 와 A.charAt(i) 를 비교한다.
		b					a
		같지 않다면 다음 작업을 수행한다.
		
		S.charAt(j+1) 와 A.charAt(i) 를 비교한다.	
		a					a
		같은 문자를 만났다면, j+1 의 값을 찍는다.
		
		S.charAt(j+3) 와 A.charAt(i) 를 비교한다.
		k							a
		같은 문자를 만나지 못했다면, -1을 출력한다.
		*/
								
		for (int i = 0; i < A.length(); i++) { //abcdef...
				
			for (int j = 0; j < S.length(); j++) { //baek 4
				
				check = 0;
				
				if (S.charAt(j) == A.charAt(i)) {
					System.out.println(j);
					check = 1;
					break;
				}
				
			}
			
			if (check == 0) {
				System.out.println(-1);
			}
			
		}		
	}
}
