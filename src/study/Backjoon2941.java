package study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Backjoon2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String vo = sc.nextLine();
		
		String[] croa = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};
		Set<String> set = new HashSet<String>();
		int cnt = 0;
		
		for (int i = 0; i < croa.length; i++) {
			//dz= 와 z= 가 겹치는 경우....
			//dz= 를 같은 길이의 문자열로 바꿔버리자!
			if (vo.contains(croa[i]) && croa[i].equals("dz=")) {
				vo = vo.replaceAll("dz=", "###");
				set.add("###");
			}
			
			if (vo.contains(croa[i])) {
				set.add(croa[i]);
			}
		}
			
		for (String string : set) {
			vo = vo.replaceAll(string, " ");
		}
		
		System.out.println(vo.length());
	}
}
