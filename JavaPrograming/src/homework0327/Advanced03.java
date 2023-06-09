package homework0327;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advanced03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		for(int i = 0; i < 6; i++) {
			System.out.println("정수를 입력하시오");
			int input = sc.nextInt();
			num.add(input);
		}
		
		int uniqueSumCount = 0;
		for(int i = 0; i < num.size(); i++) {
			for(int j = i + 1; i < num.size(); i++) {
				int sum = num.get(i) + num.get(j);
				
				boolean isUnique = true;
				for(int k = 0; k < num.size(); k++) {
					if(k != i && k != j && num.get(k) + num.get(i) == sum || 
						k != i && k != j 
						&& num.get(k) + num.get(j) == sum) {
						isUnique = false;
						break;
					}
				}
				if(isUnique) {
					uniqueSumCount++;
				}
			}
		}
		
		System.out.println("두 수의 합이 유일한 값이 되는 개수: " + uniqueSumCount);
		
		
	}
}
