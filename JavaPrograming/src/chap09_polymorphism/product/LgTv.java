package chap09_polymorphism.product;

public class LgTv extends TV {
	
	public void powerOn() {
		System.out.println("제조사: lg");
		super.powerOn();
	}
	
	public void powerOff() {
		System.out.println("제조사: lg");
		super.powerOff();
	}

	@Override
	public void operate(int channel) {
			super.operate(channel);
	}
	
	

}
