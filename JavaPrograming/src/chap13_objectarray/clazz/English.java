package chap13_objectarray.clazz;

public class English implements ILecture {
	
	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public English(String subject, int studentCnt, 
			int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}

	@Override
	public void proceedLecture() {
		System.out.println(this.subject +
				"수업을 " + this.studentCnt + 
				"명의 학생이 듣습니다. 수업시간은" +
				lectureTime + "분 입니다.");
		
	}
	
	

}
