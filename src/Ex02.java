import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num=sc.nextInt();
		if(num > 10) {
			System.out.println("1.종속문장 실행");
			System.out.println("2.종속문장 실행");
			System.out.println("3.종속문장 실행");
		}
			System.out.println("다음 문장 실행");
		
		System.out.println("수 입력 : ");
		num=sc.nextInt();
		String msg =null;
		if (num %2 ==0) {
			//System.out.println("입력 값은 짝수 :" +num);
			msg = "입력 값은 짝수 :";
		}
		if (num %2 !=0) {
			//System.out.println("입력 값은 홀수 :" +num);
			msg = "입력 값은 홀수 :";
		}
		System.out.println(msg+num);
		System.out.println("다음 문장 실행");
		
		// 수를 입력 받은 값을 절대값으로만 출력하세요 
		//절대값 |num| : 결과적으로 양의값. 부호가 없는 값
		
		int num1;
		System.out.println("절대값 수 입력: ");
		num1=sc.nextInt();
		
		if (num1>0) {
			System.out.println("num의 절대값 : "+ num1);			
		}
		if (num1<0) {
			System.out.println("num의 절대값 : "+-num1);			
		} 
		/*
		 * if (num1<0) {
			System.out.println("num의 절대값 : "+ num1*-1); //절대값 식			
		}*/

		

		
	}

}
