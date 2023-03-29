import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework32401 {

	public static void main(String[] args) throws ParseException {

		
		String[] daysOfWeek = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

       
        Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 입력하세요(yyyy-MM-dd): ");
        String dateStr = sc.nextLine();
        
       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        
       
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
        
        String result = daysOfWeek[dayOfWeek-1];
        System.out.println("요일 : " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
