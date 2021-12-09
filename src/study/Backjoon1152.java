package study;

import java.util.Scanner;

public class Backjoon1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		int cnt = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (Character.toString(text.charAt(i)).equals(" ")) {
				cnt += 1;
			}	
		}
		
		if (Character.toString(text.charAt(0)).equals(" ") && Character.toString(text.charAt(text.length()-1)).equals(" ")) {
			cnt -=1;
		}
		
		if (Character.toString(text.charAt(0)).equals(" ") || Character.toString(text.charAt(text.length()-1)).equals(" ")) {
			cnt -=1;
		}
				
		cnt +=1;
		System.out.println(cnt);	
	}

}
