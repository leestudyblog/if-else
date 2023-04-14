import java.util.Scanner;

public class Pro01 {

	public static void main(String[] args) {

		//3조 2번문제
		//사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.

		Scanner input =new Scanner(System.in);
		int a,b,c;
		
		System.out.println("숫자를 차례로 입력하시오.");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		System.out.println("a : "+ a+ " b : " +b + " c : "+c);
		if(a>b && a>c) {
			System.out.println("a가 최대값입니다.");
		}
		if(b>a && b>c) {
			System.out.println("b가 최대값입니다.");
		}
		if(c>a && c>b) {
			System.out.println("c가 최대값입니다.");
		}
		
		if(a<b && a<c) {
			System.out.println("a가 최소값입니다.");
		}
		if(b<a && b<c) {
			System.out.println("b가 최소값입니다.");
		}
		if(c<a && c<b) {
			System.out.println("c가 최소값입니다.");
		}
		int sum = a+b+c; 
		System.out.println("햡계는"+sum+"입니다.");
		System.out.println("평균은"+(sum/3)+"입니다.");
		
		
		
		
		//3조 3번 문제
				//if문만 사용해서 (else문 사용금지)
				//100점이면 S ,90점이상이면 A, 80점이상이면 B, 70점 이상이면 C
				//70점 미만이면 F가 나오도록 코딩하시오
		
	}
}

		
		

