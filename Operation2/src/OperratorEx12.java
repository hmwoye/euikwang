import java.util.Scanner;

public class OperratorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		����ڰ� �Է��� ����
		int userInput = 0;
		// �ӽ� ���
		int tempNum = 0;
		// ����ڰ� �Է��� ���� ���� Ȧ¦ ���
		String result = "";
		String userName = "";
		
		
		// Ű���� �Է�
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ȧ¦ �Ǻ� ���α׷� ����");
		userName = scan.nextLine();
		System.out.println(userName + "�� ���Ͻô� ���ڸ� �Է����ּ���");
		userInput = scan.nextInt();
		
		//�Ǻ��� ���Ѱ���
		tempNum = userInput % 2;
//		1 % 2; 1 / 2 = 0 1
//		2 % 2; 2 / 2 = 1 0
//		3 % 2; 3 / 2 = 1 1
//		4 % 2; 4 / 2 = 2 0
		
		
		
		// ����ڰ� �Է��� ���� ���� Ȧ¦ �Ǻ����
		result = (tempNum == 0 ) ? "¦" : "Ȧ";
		
		System.out.println(result);
		System.out.println(userName + "���� �Է��ϽŰ���" + userInput);
		
		
	}

}
