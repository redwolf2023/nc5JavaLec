package chap03_operator;

public class _04_threeOpOperator {

	public static void main(String[] args) {

		
		//1.  삼항 조건 연산자
		int num1 = 111;
		int num2 = 10;
		int result = num1 / num2 > 8 ?
				num1 - 11 :
				num2 - 11;
		
		System.out.println(result);
		
		//2. 삼항 조건 연산자의 중첩
		 result = num1 / num2 > 8 
			?
				num1 - 11 == 100 ?
						num1 * 2 :
						num1 / 2
			:
				num2 - 11 < 0 ?
						num2 * 2 :
						num2 / 2;	
		 System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}