import java.util.Scanner;

public class pro02 {

	public static void main(String[] args) {
		//3번 문제
		//if문만 사용해서 (else문 사용금지)
		//100점이면 S ,90점이상이면 A, 80점이상이면 B, 70점 이상이면 C
		//70점 미만이면 F가 나오도록 코딩하시오

		Scanner input =new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.");
		int score=input.nextInt();
		
		if(score==100) {
			System.out.println("S");
		}
		if(score>90) {
			System.out.println("A");
		}
		if(score>80) {
			System.out.println("B");
		}
		if(score>70) {
			System.out.println("C");
		}
		if(score<70) {
			System.out.println("F");
		}
		
	}

}
