package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class ArrayAndList {

	public static void main(String[] args) {

		//=======================================
		
		//배열 선언 하기
		String array1[] = new String[] {"","",""};
		String array2[] = new String[3];
		
		Arrays.fill(array2, "a");
		System.out.println(Arrays.toString(array2));
		//Arrays 의 fill() 메서드는 배열의 기본값을 정해줄 수 있다.
		
		//=======================================
		
		//리스트 선언 하기
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		//리스트는 그냥 찍어짐
		System.out.println(list1);
		System.out.println("List:: "+list1.get(1));
		//index로 값을 가져올 수 있으나, 이 인덱스는 절대적인 값이 아님.
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		
		arrList.get(1);
		System.out.println("arrayList:: "+arrList.get(1));
		//index로 값을 가져올 수 있으나, 이 인덱스는 절대적인 값이 아님.
		
		//=======================================
		
		//LinkedList
		LinkedList<String> link = new LinkedList<String>();
		link.add("a");
		link.add("b");
		link.add("c");
		
		System.out.println(link.get(0)); //a
		System.out.println(link.get(1)); //b
		System.out.println(link.get(2)); //c
		
		link.remove(1);
		System.out.println(link.get(0)); //a
		System.out.println(link.get(1)); //c
		//인덱스는 의미가 없음. 중간에 값을 삭제하면 뒤에 데이터가 당겨짐
		
		//=======================================
		
		//Stack & Queue
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		//Queue는 LikedList를 구현한다.
		
		for (int i = 0; i < 5; i++) {
			stack.push(i); //stack은 push로
			queue.offer(i); //queue는 offer로 값을 넣는다.
		}
		
		System.out.println("###STACK###");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
			//마지막에 들어간 5부터 출력됨
		}
		System.out.println("###QUEUE###");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
			//가장 먼저 들어간 0부터 출력됨
		}
		
		//=======================================
		
		//Hashtable :: 동기화를 지원해서 멀티 스레드 상황에서 안전하다
		//단일 스레드에서는 HashMap의 성능이 좋다
		Map<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put("a", 1);
		ht.put("b", 2);
		ht.put("c", 3);
		
		//이미 있는 키를 다시 사용하면?
		ht.put("c", 4);
		System.out.println(ht.get("c"));//4
		//값이 덮어 씌워짐
		
		//없는 키의 값을 찾으면?
		System.out.println(ht.get("d"));//null
		//null
		
		//keySet() :: 모든 키 가져오기 
		for (String key : ht.keySet()) {
			System.out.println(key +  " : " + ht.get(key));
		}
		
		
		
		
	}

}
