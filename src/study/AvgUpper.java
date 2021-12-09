package study;

import java.util.Scanner;

public class AvgUpper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt(); //케이스 수를 입력받고
		
		for (int i = 0; i < c; i++) { //케이스 수만 큼 반복한다
			
			int s = sc.nextInt(); //0케이스에서 학생수를 입력받고
			int arr[] = new int[s]; //학생수 만큼 점수를 입력받을 배열을 만든다
			double sum = 0;
			double avg = 0;
			
			for (int j = 0; j < s; j++) { //입력받은 학생수 만큼 점수를 입력하고
				arr[j] = sc.nextInt();
				sum += arr[j]; //점수들의 합을 도출한다
			}
			
			avg = (sum/s); //도출된 합으로 평균을 구한다
			double count=0;
			
			for (int j = 0; j < s; j++) { //평균이상인 학생들을 카운트 하는 작업을 학생수만큼 반복한다.
				if (arr[j] > avg) {
					count++;
				}
			}
			
			System.out.println(String.format("%.3f%%",(float)count/s*100)); //0케이스의 마지막에서 출력해주고
			//1케이스 작업을 똑같이 다시하러 간다.
		}
		
		
	}	

}
