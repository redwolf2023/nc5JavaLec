package homework0327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList aList = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			System.err.println("정수를 입력하세요.");
			int input = sc.nextInt();
			aList.add(input);
		}
		System.out.println("입력받은 정수는 다음과 같습니다.");
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		
		LinkedList<Integer> bList = new LinkedList<>();
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요.");
			int input2 = sc.nextInt();
			bList.add(input2);
		}
		bList.set(3, 100);
		bList.set(4, 200);
		System.out.println("입력받은 정수는 다음과 같습니다.");
		for(int i = 0; i < bList.size(); i++) {
			System.out.println(bList.get(i));			
		}
		
		Map<String, Integer> cList = new HashMap<>();
		for(char c = 'A'; c <= 'Z'; c++) {
			cList.put(String.valueOf(c),(int)c);
		}
		for(char c = 'a'; c <= 'z'; c++) {
			cList.put(String.valueOf(c),(int)c);
		}		
		for(String key : cList.keySet()) {
			System.out.println(key + ":" + cList.get(key));
		}	
	}
}
