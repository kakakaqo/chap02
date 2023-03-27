/**
 * 연산자 : 나눗셈의 몫을 구하는 연산자
 * 
 */

package sec02;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		
		int result4 = v1 % v2;
		System.out.println(" % 연산결과 : " + result4);
		
		int a = 10;
		if( a % 2 == 0 ) {
			System.out.println("2의배수입니다.");
		}
	}
}