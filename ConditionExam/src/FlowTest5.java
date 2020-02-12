import java.util.Scanner;

public class FlowTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 90;
		Scanner scan = new Scanner(System.in);
		System.out.println("학점을 입력하세요");
		
		score = scan.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("학점은 A입니다");
		}else if(score < 90 && score >= 80) {
			System.out.println("학점은 B입니다");
		}else if(score <= 79 && score >= 70) {
			System.out.println("학점은 C입니다");	
		}else {
			System.out.println("학점은 F입니다");
		
		
		}
	}

}
