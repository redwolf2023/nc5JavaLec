package homework7;

import java.util.Scanner;

public class MiddleReverse {
	
	public static String reverseString(String s) {
		
		String reversedString = "";
		
		for (int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        } 
		return reversedString;		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오");
		String s = sc.nextLine();
		String result = reverseString(s);
		System.out.println(result);
		sc.close();
		
		
	}

}
