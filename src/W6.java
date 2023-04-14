import java.util.Scanner;

public class W6 {

	public static void main(String[] args) {
		/*
			
			
			<2.  산책 문제>		
			첫째 줄에는 산책을 나가는 시간과 분을 입력하고 두 번째 줄에는 산책을 하는 시간을 입력합니다. 산책이 끝나고 돌아온 시간을 출력합니다.
			(시간은 0 ~ 24, 분은 0 ~ 60인 정수이다.)
			
			ex)1
			<입력>		<출력>
			15 0		16 30
			90
			
			ex)2
			<입력>		<출력>
			9 50		11 0
			70
			
			ex)3
			<입력>		<출력>
			23 45		1 15
			90
			
			
			*/
		
		
		Scanner input = new Scanner(System.in);
		int start_time =input.nextInt();
		int comeback_time =input.nextInt();
		
		
		
		
		/*
					
					
			
			<3. 블랙잭 문제>
			
			  * if문을 이용하여 랜덤 블랙잭 만들기
			         * 사용자로부터 1~100까지의 숫자 중 하나를 입력 받아 주어진 randomNumber의 값과 비교한다.
			         * 사용자가 입력한 값과 randomNumber의 차가 10보다 같거나 작으면 승리( +,- 모두 포함)
			         * 조건1 : 1~100 이외의 숫자가 입력되면 "숫자를 제대로 입력해 주세요." 메세지를 출력
			         * 조건2 : 승리할 경우에는 "승리하셨습니다." 메시지를 출력
			         * 조건3 : 패배할 경우에는 "패배하셨습니다." 메시지를 출력
			         * 조건4 : 마지막에는 입력한 값과 랜덤한 값, 그리고 두 수의 차를 출력
				   * 조건5  : 1~100 이외의 숫자가 입력되면 승리 또는 패배 및 마지막 출력 과정이 동작하지 않고 종료되어야 함
				   * 1~100까지의 랜덤한 수 -> int randomNumber = (int) Math.round(Math.random() * 99) + 1;
			
					
			
			*/
	}

}
