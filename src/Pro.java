import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {
		
		/*
		  사용자에게 연도를 입력받아 윤년이면 "해당 연도는 윤년입니다.", 아니면 "해당 연도는 윤년이 아닙니다."을 출력하는 프로그램을 작성하시오.

		 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		예) 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
   		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
   		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		 */
		
		Scanner input =new Scanner(System.in);
		
		int year;
		int notyoon;
		
		System.out.println("연도를 입력하시오 : ");
		year=input.nextInt();
		
		if (year%4==0 && year%100!=0) {
			
			System.out.println("해당 연도는 윤년입니다.");
		}
		if (year % 400 ==0 ){
			System.out.println("해당 연도는 윤년이 아닙니다.");

		}
		
		

	}

}
