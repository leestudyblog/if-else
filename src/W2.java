import java.util.Scanner;

public class W2 {

	public static void main(String[] args) {
		/*
		 * - 문제(구구단)

			직접 입력한 구구단의 정답을 입력하는 코드
			
			정수형 변수 dan에 구구단 단수를 입력
			정수형 변수 num1에 9 대입
			
			dan * 9 의 정답을 직접 입력하고 정답인지 아닌지 확인하는 문장 출력
			정답입니다.
			오답입니다.
			*/
		
		Scanner input = new Scanner(System.in);
		int dan = input.nextInt();
		int num1=9;
		int as=input.nextInt();
		
		if ((dan*num1) == as) {
			System.out.println(dan+"X"+num1+"="+as+ "정답입니다.");
			
		}
		if ((dan*num1) != as) {
			System.out.println(dan+"X"+num1+"="+as+"오답입니다.");
			
		}
		
		
		/*
			
			사이패스
			성인인지 미성년자인지 구분합니다.
			
			*/
		System.out.println("나이를 입력하시오: ");	
		int age = input.nextInt();
		
		if (age>=19) {
			System.out.println("당신은 성인입니다.");
		}
		if (age<19) {
			System.out.println("당신은 미성년자입니다.");
		}
		
		
			/*
			
		 * */
	}

}
