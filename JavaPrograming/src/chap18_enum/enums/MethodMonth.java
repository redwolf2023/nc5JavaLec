package chap18_enum.enums;

public enum MethodMonth {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8),
	SEP(9), OCT(10), NOV(11), DEC(12);

	private int mothVal;
	
	MethodMonth(int monthVal) {
		this.mothVal = monthVal;
	}

	public int getMothVal() {
		return mothVal;
	}
	
	public static void printMonth(int month) {
		MethodMonth[] monthArr = values();
		for(int i = 0; i < monthArr.length; i++) {
			if(monthArr[i].getMothVal() == month) {
				System.out.println("입력한 달은" + 
						monthArr[i].getMothVal() + "월 입니다.");
				
			}
		}
	}
	
	public void printAddMonth(int month) {
		if(this.getMothVal() + month <= 12) {
		System.out.println(month + "개월 뒤는" 
				+ this.getMothVal() + month + "월 입니다");
		}else {
			int remain = this.getMothVal() + month - 12;		 
				while(remain <= 12) {
					remain -= 12;				
				System.out.println(month + "개월 뒤는" 
						+ (JAN.mothVal + remain -1) + "월 입니다");
			}
		}
	}
}
