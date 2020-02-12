import java.util.Scanner;

public class OperratorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		사용자가 입력할 변수
		int userInput = 0;
		// 임시 결과
		int tempNum = 0;
		// 사용자가 입력한 값에 대한 홀짝 결과
		String result = "";
		String userName = "";
		
		
		// 키보드 입력
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("홀짝 판별 프로그램 시작");
		userName = scan.nextLine();
		System.out.println(userName + "님 원하시는 숫자를 입력해주세요");
		userInput = scan.nextInt();
		
		//판별을 위한과정
		tempNum = userInput % 2;
//		1 % 2; 1 / 2 = 0 1
//		2 % 2; 2 / 2 = 1 0
//		3 % 2; 3 / 2 = 1 1
//		4 % 2; 4 / 2 = 2 0
		
		
		
		// 사용자가 입력한 값에 대한 홀짝 판별결과
		result = (tempNum == 0 ) ? "짝" : "홀";
		
		System.out.println(result);
		System.out.println(userName + "님이 입력하신값은" + userInput);
		
		
	}

}
