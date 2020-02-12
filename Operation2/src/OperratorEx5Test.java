
public class OperratorEx5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1인지 0인지 판단하는 프로그램
		
//		int input = 1;
//		
//		String a = "전원이 켜집니다."
//		String b = "전원을 종료합니다."
//
//		String rerult = ((input == 1)String a:String b
//		
//		System.out.println(result);
		
		
//		삼항연산자를 이용해서 
		
//		입력한 값이1이면 
//		"전원이 켜집니다."
		
//		입력한 값이 0이면
//		0이면 "전원을 종료합니다."
		
		
		
//		판단할 변수
		
		int input = -1;
		
		input = 300;
		String result = "";
//		result = (input == 1) ? "입력하신 값은 1\n전원을 켰습니다"
//				: "입력하신 값은 0\n전원을 종료합니다";
//		
//		System.out.println(result);
//		 
		
		result = (input == 1) ? "입력하신 값은 1\n전원을 켰습니다"
				: (input == 0) ? "입력하신 값은 0\n전원을 종료합니다" 
				: "입력하신 값은" + input + "\n 잘못입력했습니다";
				
		System.out.println(result);
		
		
	}

}
