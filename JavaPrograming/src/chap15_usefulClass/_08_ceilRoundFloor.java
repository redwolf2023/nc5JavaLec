package chap15_usefulClass;

public class _08_ceilRoundFloor {

	public static void main(String[] args) {

		
		double num = 123.45678;
		
		System.out.println(Math.ceil(num));
		System.out.println((double)Math.round(num));
		System.out.println(Math.floor(num));
		
		System.out.println(Math.round((double)num * 1000)/1000);
	}

}
