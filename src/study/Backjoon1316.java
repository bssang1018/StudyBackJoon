package study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Backjoon1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = new String[sc.nextInt()]; //단어들이 들어가있는 배열
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		
		String[][] str2 = new String[str.length][];
		
		for (int i = 0; i < str.length; i++) {
			str2[i] = str[i].split("");
		}

		for (int i = 0; i < str2.length; i++) {
			str2[i] = str[i].split("");
		}

		//===========================
		
		String alph = "";
		String text = "";
		int cnt = str.length;
		
		for (int i = 0; i < str.length; i++) {
			
			for (int j = 0; j < str2[i].length-1; j++) {
				if (!str2[i][j].equals(str2[i][j+1])) { //현재 알파벳이 다음 알파벳과 같지 않다면
					alph = str2[i][j]; //현재 알파벳을 기억하고
					text = str[i].substring(j+1,str[i].length()); //현재 알바벳을 빼고 문자열을 자름
					if (text.contains(alph)) { //자른 문자열이 현재 알파벳을 포함하고 있다면, 이것은 단어가 아님
						cnt -= 1; 
						break;
					}
				}
			}
			
		}
				
		System.out.println(cnt);
			
	}		
}

