package homework7;

import java.util.Scanner;

public class _01_BasicTest {
	
	public static String getMiddleChars(String s) {
			
	        int length = s.length();
	        int midIndex = length / 2;
	        if (length % 2 == 0) {
	            return s.substring(midIndex - 1, midIndex + 1);
	        } else {
	            return s.substring(midIndex, midIndex + 1);
	        }
	}

    public static String removeVowels(String st) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'
                && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String CountGaba(String str) {
    	 int gaCount = 0, baCount = 0;
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == '가') {
                 gaCount++;
             } else if (str.charAt(i) == '바') {
                 baCount++;
             }
         }
         if (gaCount == 0 && baCount == 0) {
             System.out.println("가, 바가 존재하지 않습니다.");
         } else {
             System.out.println("가의 개수: " + gaCount);
             System.out.println("바의 개수: " + baCount);
         }
		return str;
		
    }
    
    public static boolean containsString(String str1, String str2) {
        return str1.contains(str2);
    }
    	
   
	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        System.out.println("가운데 글자만 출력되는 문자열 쓰기");
	        String s = scanner.nextLine();
	        String result = getMiddleChars(s);
	        System.out.println("결과: " + result);
	        System.out.println("모음이 제거된 문자열 쓰기");
	        String st = scanner.nextLine();
	        String result1 = removeVowels(st);
	        System.out.println("결과:" +result1);
	        System.out.println("가,바의 개수만 출력되는 문자열 쓰기");
	        String str = scanner.nextLine();
	        String result2 = CountGaba(str);
	        System.out.println("결과:" + result2);
	        
	        scanner.close();
        
      
	}
	
	
	


}
