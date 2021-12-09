package study;

import java.util.Scanner;

public class Subway {

	  public static void main(String[] args) {
	         
	      
	      String[] station = {"장승배기", "연신내", "강남", "양재", "평택"};
	         
	      int[][] trail ={{-1, -1, -1, -1},
	                  {-1, -1, -1, -1},
	                  {-1, -1, -1, -1},
	                  {-1, -1, -1, -1}};         
	         
	      int now = 0;
	      int pos = -1;         
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("지하철에 오신걸 환영합니다.");
	      
	      while(true) {
	         
	         System.out.println("현재역은 " + station[now] + "입니다.");
	         
	         System.out.println("1.이동 2.탑승 3.상태보기 9.종료");
	         
	         String input = sc.nextLine();         
	         
	         if(input.equals("1")) {                     
	            if(now == station.length - 1 || now == 0){         
	               pos *= -1;      
	            }            
	            now += pos;
	            
	         }//1번 if문
	      } //while   
	   } //main end
	}//class end