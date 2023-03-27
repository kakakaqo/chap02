package sec03;

import java.util.PrimitiveIterator.OfDouble;

public class EmptyStringExample {
	public static void main(String[] args) {
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
	}
}
// 문자열 사용할땐 == x  /  equals() o