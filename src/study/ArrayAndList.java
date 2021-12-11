package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
		List<String > list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		//리스트는 그냥 찍어짐
		System.out.println(list1);
		
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
		
		
	}

}
