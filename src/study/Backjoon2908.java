package study;

import java.util.Scanner;

public class Backjoon2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a=sc.next();
		String b=sc.next();
		
		StringBuilder sba = new StringBuilder();
		StringBuilder sbb = new StringBuilder();
		
		for (int i = 2; i >= 0; i--) {
			sba.append(a.charAt(i));
			sbb.append(b.charAt(i));
		}
		
		int aa=Integer.parseInt(sba.toString());
		int bb=Integer.parseInt(sbb.toString());
		
		if (aa > bb) {
			System.out.println(aa);
		}else {
			System.out.println(bb);
		}
		
		
	}

}
