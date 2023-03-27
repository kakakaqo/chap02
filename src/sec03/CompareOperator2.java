package sec03;

import java.util.Scanner;

public class CompareOperator2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' '; // char type은 반드시 ' '로 초기화( ‘’ 아님)
		System.out.printf("영문자와 숫자 또는 한글을 입력하시오.");
		String input = scanner.nextLine(); // 한 문장을 통째로 읽어온다.(문자열)
		ch = input.charAt(0); // 읽어온 문자열에서 맨 첫 글자를 취한다.
		
		//숫자
		if( '0' <= ch && ch <= '9' ) {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다.", ch, (int)ch);
		}
		// 소문자
		if( 'a' <= ch && ch <= 'z' ) {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다.", ch, (int)ch);
		}
		// 대문자
		if( 'A' <= ch && ch <= 'Z' ) {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다.", ch, (int)ch);
		}
	}	
}