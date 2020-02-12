
public class OperratorEx4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		내림 처리
		float pi = 3.141592f;
		
//		소수점 3쨰자리까지 표현
//		원본값 * 자릿수 / 되돌릴 자릿수 => 자릿수내림
		float shortPi = (int)(pi * 1000) / 1000f;
		
		System.out.println(shortPi);
		
		
		
	}

}
