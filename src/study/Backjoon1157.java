package study;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Backjoon1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String big = str.toUpperCase();
		String[] arr = big.split("");
		Set<String> set = new HashSet<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {//0~7
			set.add(arr[i]);
		}
		
		for (String alpa : set) {
			cnt = 0;	
			//문자비교 작업
			for (int i = 0; i < arr.length; i++) {				
				if (arr[i].equals(alpa)) {
					cnt += 1;
				}				
			}
			map.put(alpa, cnt);
		}	
		
		int max = Collections.max(map.values()); //map에서 가장큰 값을 가져올 수 있음
		
		//EntrySet은 HashMap에 저장된 key-value 값을 엔트리의 형태(키와 값을 결합한 형태)로 set에 저장하여 반환
		//{A=1,B=2,C=3} => [A=1,B=2,C=3]
		for (java.util.Map.Entry<String, Integer> key: map.entrySet()) {
			if (max == key.getValue()) {
				sb.append(key.getKey());
			}
		}
		
		for (java.util.Map.Entry<String, Integer> key: map.entrySet()) {
			if (sb.length() > 1) {
				System.out.println("?");
				break;
			}
			if (max == key.getValue()) {
				System.out.println(key.getKey());
			}
		}
		
		
	}
}