package chap13_objectarray;

import chap13_objectarray.clazz.English;
import chap13_objectarray.clazz.ILecture;
import chap13_objectarray.clazz.Mathmetics;
import chap13_objectarray.clazz.Programming;


public class _02_objectArray {

	public static void main(String[] args) {

		ILecture[] lecArr = new ILecture[3];
		
		lecArr[0] = new English("영어", 30, 60);
		lecArr[1] = new Mathmetics("수학", 25, 50);
		lecArr[2] = new Programming("컴퓨터", 10, 30);
		
		for(int i = 0; i <lecArr.length; i++) {
			lecArr[i].proceedLecture();
		}
	}

}
