package homework0323;

import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer(30);
		String str1 = "abc";
		String str2 = "def";
		String str3 = "ghi";
		sb.append(str1);
		sb.append(str2);
		sb.append(str3);
		System.out.println(sb);
		
		String str4 = "hello";
		sb1.append(str4);
		int emptySpace = 30 - sb1.length();
		char[] fill = new char[emptySpace];
		Arrays.fill(fill,'a');
		sb1.append(fill);
		System.out.println(sb1);
		
		double num = 16.459;
		
		System.out.println(((double)Math.round(num * 100)/ 100.0));
				
		String str5 = "145.987";		
		String str6 = "-563.11";
		
		double num1 = Double.valueOf(str5);
		double num2 = Double.valueOf(str6);
		
		double sum = num1 + num2;
		System.out.println(sum);
		
		
		
		
		
	}

}
