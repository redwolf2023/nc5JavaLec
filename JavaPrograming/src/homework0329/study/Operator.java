package homework0329.study;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {

		//1.사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int a = sc.nextInt();
//		System.out.println("정수를 입력하세요");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		int sub = 0;
//		int mul = 0;
//		int div = 0;
//		
//		sum = a + b;
//		sub = a - b;
//		mul = a * b;
//		div = a / b;
//		System.out.println("두 정수의 합 :" + sum);
//		System.out.println("두 정수의 빼기 :" + sub);
//		System.out.println("두 정수의 곱 :" + mul);
//		System.out.println("두 정수의 나누기 :" + div);
		
		//2.int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
		
//		int i = 20;
//		System.out.println(++i);//21
//		System.out.println(++i);//22
//		System.out.println(i);//22
//		System.out.println(i--);//22
//		System.out.println(--i);//20
//		System.out.println(i--);//20
//		System.out.println(i++);//19
//		System.out.println(i);//20
//		
		//3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
		
//		System.out.println("정수를 입력하세요.");
//		int input = sc.nextInt();
//		if(input % 14 == 0) {
//			System.out.println("2와 7의 공배수");
//		}else {
//			System.out.println("2와 7의 공배수 아님");
//		}
		
		//4.사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
		
//		System.out.println("문자열을 입력하시오");
//		String a = sc.nextLine();
//		if(a == "Hello") {
//			System.out.println("Hello 가 맞습니다");
//		} else {
//			System.out.println("Hello 가 아닙니다.");
//		}
		
		//5.삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
		
//		System.out.println("정수를 입력하세요.");
//		int input = sc.nextInt();
//		System.out.println(input + " (은)" +(input % 2 == 0 ? "짝수입니다" : "홀수입니다."));
		
		//6.삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
		
//		System.out.println("정수를 입력하세요.");
//		int num = sc.nextInt();
//		System.out.println((num + " (은)" + (num > 100 ? "100보다 큼" : num < 100 ? "100보다 작음" : "100")));
		
		//7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		
//		double a,b;
//		
//		
//		System.out.println("실수를 입력하세요");
//		a = sc.nextDouble();
//		System.out.println("실수를 입력하세요");
//		b = sc.nextDouble();
//		
//		double sum = a + b;
//		double sub = a - b;
//		double mul = a * b;
//		double div = a / b;
//		double rem = a % b;
//		
//		System.out.println(sum);
//		System.out.println(sub);
//		System.out.println(mul);
//		System.out.println(div);
//		System.out.println(rem);
			
		//8.사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
				
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		System.out.println("입력한 문자열은 " + str + " 이고 입력한 숫자는 " + num + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
