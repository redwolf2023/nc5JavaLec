import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Homework0324 {

	public static void main(String[] args) {

		Calendar cal1 = Calendar.getInstance();
		
		cal1.set(2022, 3, 24);
		cal1.set(Calendar.YEAR, 2020);
		cal1.set(Calendar.MONTH, 4);
		cal1.set(Calendar.DATE, 8);
		
		System.out.println(cal1.get(Calendar.YEAR) + "년" + 
						   cal1.get(Calendar.MONTH) + "월" + 
						   cal1.get(Calendar.DATE) + "일");
		
		
		//3일뒤
		cal1.add(Calendar.DATE, 3);
		System.out.println(cal1.get(Calendar.YEAR) + "년" +
				  		  (cal1.get(Calendar.MONTH)) + "월" + 
				  		   cal1.get(Calendar.DATE) + "일");
		
		//2달뒤
		cal1.add(Calendar.MONTH, 2);
		System.out.println(cal1.get(Calendar.YEAR) + "년" +
				  		  (cal1.get(Calendar.MONTH)) + "월" + 
				  		   cal1.get(Calendar.DATE) + "일");
		//5년뒤
		cal1.add(Calendar.YEAR, 5);
		System.out.println(cal1.get(Calendar.YEAR) + "년" +
		  		  		  (cal1.get(Calendar.MONTH)) + "월" + 
		  		  		   cal1.get(Calendar.DATE) + "일");
		System.out.println("---------------------------------");
		
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023, 3, 24);
		System.out.println(cal2.get(Calendar.YEAR) + "-" + 
						   cal2.get(Calendar.MONTH) + "-" +
						   cal2.get(Calendar.DATE));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		
		Date now = new Date();
		
		System.out.println(sdf.format(now));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
