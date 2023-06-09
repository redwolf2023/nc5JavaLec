import java.util.Calendar;

public class Homework32403 {

	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2023, 3, 15, 20, 31, 45);
		cal2.set(2021, 7, 8, 11, 58, 4);
		
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		System.out.println((diff / (1000 * 60 * 60)) + "시" + 
							(diff / 1000 * 60) + "분" + 
							(diff /1000) + "초");

	}

}
