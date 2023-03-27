package sec04;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// if문을 이용한
		System.out.println("첫번째 숫자를 입력하시오.");
		int a = scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오.");
		int b = scanner.nextInt();
		
		if( a > b ) {
			System.out.println("첫번째 숫자가 더 큽니다");
		}else if( a < b ) {
			System.out.println("두번째 숫자가 더 큽니다");
		}else {
			System.out.println("두 수가 같습니다");
		}
		
		// 삼항연산자를 이용한
		System.out.println("");
		System.out.println("첫번째 숫자를 입력하시오.");
		int c = scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오.");
		int d= scanner.nextInt();
		
		String st1 = ( c > d ) ? "첫번째 숫자가 더 큽니다" : "두번쨰 숫자가 더 큽니다";
		System.out.println(st1);
		
		// 자원 닫기
		scanner.close();
	}
}