package homework0329.study;

import java.math.BigDecimal;
import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {

		//1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫번째 정수를 입력하세요.");
//		String a = sc.next();
//		System.out.println("두번째 정수를 입력하세요.");
//		String b = sc.next();
//		
//		int number1 = Integer.parseInt(a);
//		int number2 = Integer.parseInt(b);
//		int sum = number1 + number2;
//		
//		System.out.println("두 정수의 합 : " + sum);
//		
		//2.사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)

//		int a,b;
//		double dv= 0;
//		
//		while(true) {
//		System.out.println("첫번째 정수를 입력하세요.");
//		a = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		b = sc.nextInt();
//		
//		
//		if(b != 0) {
//			dv = (double) a / b;
//			break;
//		} else{
//			System.out.println("0을 입력할 수 없습니다.");			
//		}
//	}
//		
//		System.out.println("두 정수의 나누기 : " + dv);
//		
		
		//3.사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//		int i = 0;
//		
//		System.out.println("실수 하나를 입력하세요.");
//		double a = sc.nextDouble();
//		i = (int)a;
//		
//		System.out.println(i);
		
		//4.사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
		
//		System.out.println("실수 하나를 입력하세요.");		
//		double a = sc.nextDouble();
//		double square = a * a;
//		String result = Double.toString(square);
//		System.out.println("입력한 실수의 제곱은 " + result + "입니다.");
		
		//5.int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
		
//		int iNum = 10;
//		long lNum = 20L;
//		
//		int i = iNum;
//		iNum = (int)lNum;
//		lNum = i;
//		System.out.println(iNum);
//		System.out.println(lNum);
		
		//6.사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		System.out.println("문자 하나를 입력하세요.");
		char ch1 = sc.next().charAt(0);
		System.out.println("문자 하나를 입력하세요.");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("첫번째 문자 유니코드 : " + (int)ch1);
		System.out.println("두번째 문자 유니코드 : " + (int)ch2);
		
		
				
		
		
		
		
		
		
		
	}

}
