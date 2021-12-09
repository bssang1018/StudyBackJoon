package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Backjoon5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String call = sc.nextLine();
		int sec = 0;
		String alpa = "";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ABC", 3);//2
		map.put("DEF", 4);//3
		map.put("GHI", 5);//4
		map.put("JKL", 6);//5
		map.put("MNO", 7);//6
		map.put("PQRS", 8);//7
		map.put("TUV", 9);//8
		map.put("WXYZ", 10);//9
		
		for (int i = 0; i < call.length(); i++) {
			
			alpa = "";
			alpa = Character.toString(call.charAt(i));
			
			for (Entry<String, Integer> ent : map.entrySet()) {
				
				if (ent.getKey().contains(alpa)) {
					sec += ent.getValue();
				}
				
			}
			
		}
		
		System.out.println(sec);
	
	}

}
