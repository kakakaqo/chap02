/**
 * 두 수를 비교해주는 함수
 * @param a
 * @param b
 */

package sec04;

import java.util.Scanner;

// 인자
public class IfModule {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오.");
		int a = scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오.");
		int b = scanner.nextInt();
		
		compareTwoNumber(a, b);
		
		// 자원 닫기
		scanner.close();
	}
	// 지역 변수 매게변수 //메인변수에서 여기로 전달됨
	private static void compareTwoNumber(int a, int b) {
		if( a > b ) {
			System.out.println("첫 번째 숫자가 큽니다.");
		}else if( a < b ) {
			System.out.println("두 번째 숫자가 큽니다.");
		}else {
			System.out.println("두 수가 같습니다.");
		}
	}
}