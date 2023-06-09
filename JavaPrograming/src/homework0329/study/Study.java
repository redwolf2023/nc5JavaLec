package homework0329.study;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		//1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		
		boolean isExit = false;
		
		while(true) {
			System.out.println("사람 정보");
			System.out.println("1.이름 입력");		
			System.out.println("2.나이 입력");
			System.out.println("3.성별 입력");
			System.out.println("4.입력한 정보 출력");
			System.out.println("5.종료");
			
			int userInput = sc.nextInt();

			switch(userInput) {
			case 1:
				System.out.print("이름을 입력하세요. : ");
				String name = sc.next();
				sc.nextLine();
				person.setName(name);
				break;
			case 2:
				System.out.print("나이를 입력하세요. : ");
				int age = sc.nextInt();
				person.setAge(age);
				break;
			case 3:
				System.out.println("성별을 입력하세요 : ");
				String gender = sc.next();
				sc.nextLine();
				person.setGender(gender);
				break;
			case 4:
				person.PersonInfo();
				break;
			case 5:
				isExit = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
			if(isExit) {
				break;
			}
			}
		sc.close();
		}
	}


