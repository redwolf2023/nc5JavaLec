package homework0327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Middle {

	public static void main(String[] args) {

		Map<String, Integer> student = new HashMap<>();
		student.put("허준", 100);
		student.put("홍길동", 50);
		student.put("이순신", 90);
		student.put("강감찬", 80);
		
		int maxScore = 0;
		String topStudent = "";
		for(String name : student.keySet()) {
			int score = student.get(name);
			if(score > maxScore) {
				maxScore = score;
				topStudent = name;
			}
		}
		
		System.out.println("최고 점수를 받은 학생은 " + topStudent + 
				"이며, 점수는 " + maxScore + "점 입니다.");
		
		int[]arr = {1, 2, 3, 4, 5};
		
		Map<String, Integer> add = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				String key = Integer.toString(sum);
				if(add.containsKey(key)) {
					int count = add.get(key) + 1;
					add.put(key, count);
				} else {
					add.put(key, 1);
				}
			}
		}
		for(String key : add.keySet()) {
			int count = add.get(key);
			System.out.println(key + ":" + count);
		}
//	public class PhoneInfo{
//		List<Map<String, String>> phoneList = new ArrayList<>();		
//	
//		
//		public void insertPhoneInfo(String name, String phoneNum) {
//			Map<String, String> phoneInfo = new HashMap<>();
//			phoneInfo.put("name", name);
//			phoneInfo.put("phoneNum", phoneNum);
//			phoneList.add(phoneInfo);
//			}
//		
//		public void printAllPhoneInfo() {
//			for(Map<String, String> phoneInfo : phoneList) {
//				System.out.println("이름 : " + phoneInfo.get("name") + 
//						", 번호 : " + phoneInfo.get("phoneNum"));
//			}
//		}
//		
//		public void printPhoneInfo(String phoneNum) {
//			boolean found = false;
//			for(Map<String, String> phoneInfo : phoneList) {
//				if(phoneNum.equals(phoneInfo.get("phoneNum"))) {
//					System.out.println("이름 : " + phoneInfo.get("name") + 
//							", 번호 : " + phoneNum);
//					found = true;
//					break;
//				}
//			}
//			if(!found) {
//				System.out.println("해당 번호로 저장된 정보가 없습니다.");
//			}
		}
	}

