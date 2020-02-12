import java.util.Scanner;

public class FlowTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다중if문, 중첩if문
		int scoreNum = 90;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		
		scoreNum = scan.nextInt("당신의 점수는" + scoreNum)
		
		if(scoreNum >= 90) {
			grade = "A";
			}if(scoreNum >= 98) {
				grade += "+"
		}else if(scoreNum >= 80) {
				}grade = "B";
			if(scoreNum >= 88) {
				grade += "+";
			}else if(scoreNum < 84) {
				grade = grade + "+";
			}
		}else if (scoreNum >= 70) {
			grade = "C";
		}else {
			grade = "f";
			System.out.println("학점은" + grade + "입니다");
		
		
		}
	}

}
