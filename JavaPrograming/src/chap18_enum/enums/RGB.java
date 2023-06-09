package chap18_enum.enums;

public enum RGB {
	//상수명 RED("red", 255, 0, 0), 
	//	   GREEN, 
	//     BLUE
	RED("red", 255, 0, 0) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColorStr())) {
					if(index == 0) {
						System.out.println(s + ",");
					} else {
						System.out.println(s + " ");
					}
					index++;
				}
			}
			System.out.println("색상이 부족합니다");
		}
	},
	GREEN("green", 0, 255, 0) {
		@Override
		public void makeWhite() {
String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColorStr())) {
					if(index == 0) {
						System.out.println(s + ",");
					} else {
						System.out.println(s + " ");
					}
					index++;
				}
			}
			System.out.println("색상이 부족합니다");
		}
	},
	BLUE("blue", 0, 0, 255) {
		@Override
		public void makeWhite() {
String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColorStr())) {
					if(index == 0) {
						System.out.println(s + ",");
					} else {
						System.out.println(s + " ");
					}
					index++;
				}
			}
			System.out.println("색상이 부족합니다");
		}
	};
	
	private String colorStr;
	private int red;
	private int green;
	private int blue;
	
	RGB(String colorStr, int red, int green,
			int blue) {
		this.colorStr = colorStr;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public String getColorStr() {
		return colorStr;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}
	
	public abstract void makeWhite();
}
