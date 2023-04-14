import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*제어문 : 프로그램의 흐름을 제어하는 것
		  if(조건식)
		  	종속문장 (종속문장 하나일 때만 사용가능)
		  if(조건식){
		  	종속문장
		  }
		  */
		
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("1.쉬운 게임");
		System.out.println("2.어려운 게임");
		System.out.println(">>> : ");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("쉬운 게임을 실행합니다.");
		}
		if (num == 2) {
			System.out.println("어려운 게임을 실행합니다.");
			System.out.println("다음문장 실행합니다.");
		}
		
		


		
		
	}

}
