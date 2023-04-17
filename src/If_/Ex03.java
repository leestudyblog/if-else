package If_;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		정수를 입력받아 아래와 같이 출력
		3의배수 이며 4의배수
		3의배수
		4의 배수
		3,4의 배수 아님
		0은 잘못 입력 
		  */
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("수 입력");
		num = input.nextInt();
		
		if (num ==0) {
			System.out.println("0은 잘못입력");
		}
		else if(num %3==0 && num%4==0 ) {
			System.out.println("3의 배수이며 4의 배수");
		}else if(num%3==0) {
			System.out.println("3의 배수");}
		else if(num%4==0) {
				System.out.println("4의 배수");
			}
		else if(num %3!=0 && num%4 !=0) {
			System.out.println("3,4의 배수 아님");
		}
		
		//필수 문장을 맨 처음 배치
	}

}
