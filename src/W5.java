import java.util.Scanner;

public class W5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.입력한 숫자가 2의 배수이고 5의 배수인 수인지 판별 
		 */
		/*Scanner input = new Scanner(System.in);
		System.out.println("입력하시오");
		int num = input.nextInt();
		
		if (num%2==0 && num%5==0) {
			System.out.println("2와 5의 공통배수입니다.");
		}
		if (num%2==0) {
			System.out.println("2의 배수입니다.");
		}
		if (num%5==0) {
			System.out.println("5의 배수입니다.");
		}*/
		
		
		
		/*
		4. 입력받은 수가 3또는 5의 배수인지 판별하고, 15의 배수라면 15의 배수라고 출력
		 * 
		 * */
		Scanner input = new Scanner(System.in);
		System.out.println("입력하시오");
		int num1 = input.nextInt();
		
		if (num1%3==0 && num1%5==0) {
			System.out.println("3과 5의 공통배수입니다.");
		}
		if (num1%3==0) {
			System.out.println("3의 배수입니다.");
		}
		if (num1%5==0) {
			System.out.println("5의 배수입니다.");
		}
		if (num1%15==0) {
			System.out.println("15의 배수입니다.");
		}
		 
		 
	}

}
