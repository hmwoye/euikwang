
public class OperratorEx5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1���� 0���� �Ǵ��ϴ� ���α׷�
		
//		int input = 1;
//		
//		String a = "������ �����ϴ�."
//		String b = "������ �����մϴ�."
//
//		String rerult = ((input == 1)String a:String b
//		
//		System.out.println(result);
		
		
//		���׿����ڸ� �̿��ؼ� 
		
//		�Է��� ����1�̸� 
//		"������ �����ϴ�."
		
//		�Է��� ���� 0�̸�
//		0�̸� "������ �����մϴ�."
		
		
		
//		�Ǵ��� ����
		
		int input = -1;
		
		input = 300;
		String result = "";
//		result = (input == 1) ? "�Է��Ͻ� ���� 1\n������ �׽��ϴ�"
//				: "�Է��Ͻ� ���� 0\n������ �����մϴ�";
//		
//		System.out.println(result);
//		 
		
		result = (input == 1) ? "�Է��Ͻ� ���� 1\n������ �׽��ϴ�"
				: (input == 0) ? "�Է��Ͻ� ���� 0\n������ �����մϴ�" 
				: "�Է��Ͻ� ����" + input + "\n �߸��Է��߽��ϴ�";
				
		System.out.println(result);
		
		
	}

}
