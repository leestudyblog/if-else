package If_;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		  if(조건문) { //참인경우 종속문장 실행
		  	종속문장
		  }
		  else{ //if의 조건인 거짓인경우 종속문장 실행
		  }	 
		  
		  */
		
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num %3 ==0) {
			System.out.println("입력 수 3의 배수");
		}else {
			System.out.println("입력 수 3의 배수아님!");
		}
		System.out.println("다음 문장 실행");
		
		// 수를 입력 받아 0보다 크고 100보다 작으면 정상, 아니면 비정상 출력
	
		int num1;
		System.out.println("수 입력");
		num=input.nextInt();
		if(num >=0 && num<=100) {
			System.out.println("정상");
		}
		else {
			System.out.println("비정상");
		}
		
		
		
		}
	
	}


