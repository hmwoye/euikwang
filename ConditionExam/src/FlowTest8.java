
public class FlowTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		score = (int)(Math.random() * 6) + 1;
		
		switch (score) {
			case 1:
				System.out.println("1칸전진");
				break;
			case 2:
				System.out.println("2칸전진");
				break;
			case 3:
				System.out.println("3칸전진");
				break;
			case 4:
				System.out.println("4칸전진");
				break;
			case 5:
				System.out.println("5칸전진");
				break;
			case 6:
				System.out.println("6칸전진");
				break;
			

		default:
			System.out.println("꽝입니다");
			break;
		}
		
		
		
		
		
	}

}
