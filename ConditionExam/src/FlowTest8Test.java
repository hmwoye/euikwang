
public class FlowTest8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		score = (int)(Math.random() * 6) + 1;
		
		System.out.println("초지키는 몇일까요?!");
		
		switch (score) {
			case 1:
				System.out.println("169cm");
				break;
			case 2:
				System.out.println("호빗");
				break;
			case 3:
				System.out.println("181cm");
				break;
			case 4:
				System.out.println("175cm");
				break;
			case 5:
				System.out.println("190cm");
				break;
			case 6:
				System.out.println("거인족");
				break;
			

		default:
			System.out.println("꽝입니다");
			break;
		}
		
		
		
		
		
	}

}
