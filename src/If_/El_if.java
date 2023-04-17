package If_;

import java.util.Scanner;

public class El_if {

	public static void main(String[] args) {
		/*
		  if , else if 또는 else 중 하나만 실행된다.
		 
		 if(조건식){
		 	종속문장
		 } else if(조건식){
		 	종속문장
		 }
		 ...
		 else if(조건식){
		 	종속문장
		 }
		  
		  */
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		int num ;
		System.out.println("수 입력");
		num = input.nextInt();
		
		if (num > 100) {
			
			System.out.println("100보다 크다");
		}else if(num >50) {
			System.out.println("50보다 크다");
		}else if(num >30) {
			System.out.println("30보다 크다");
		}
		else {
			System.out.println("30보다 작거나 같은 수");
		}
		 System.out.println("다음 문장 실행");
		
		 //if로만 문장 실행
		 if (num > 100) {
				
				System.out.println("100보다 크다");
			} if(num >50) {
				System.out.println("50보다 크다");
			}if(num >30) {
				System.out.println("30보다 크다");
			}
			else{
				System.out.println("30보다 작거나 같은 수");
			}
			 System.out.println("다음 문장 실행");
			
		
		*/
		
			 /*
			  커피가격 2000원 10개 초과하면 개당 1500원씩 받는다
			  커피 개수 입력 받아 금액을 출력하시오
			  10면 20000
			  11 21500
			  * */
			Scanner input = new Scanner(System.in);
			 
			 int num1, price;
			 price=0;
				System.out.println("커피 개수 입력");
				num1 = input.nextInt();
				
				
				if (num1<=10) {
					price=num1*2000;
					System.out.println("커피 가격은 " + (price)+"입니다.");
				}else {
					price=20000+(num1-10)*1500;
					
				}
					System.out.println("커피 가격은"+price+ "입니다.");
			 
			 
		
	}//실행함수

}//class
