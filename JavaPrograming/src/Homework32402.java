import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework32402 {

	public static void main(String[] args) throws ParseException {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요(yyyy-MM-dd): ");
	    String dateStr1 = sc.nextLine();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf1.parse(dateStr1);
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		cal1.add(Calendar.DATE,3);
		String result = sdf1.format(cal1.getTime());
		
		System.out.println("3일 후의 날짜" + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
