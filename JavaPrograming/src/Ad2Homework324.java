import java.util.Scanner;

public class Ad2Homework324 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력:");
		String input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		char prev ='\0';
		
		for(int i = 0; i < input.length(); i++) {
			char curr = input.charAt(i);
			if(curr != prev) {
				sb.append(curr);
				prev = curr;
			}
		}
		System.out.println("결과:" + sb.toString());
		
		
		
		
		
		
		
		
		
		
	}

}
