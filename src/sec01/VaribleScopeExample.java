/**
 * 변수의 사용 범위(scope)
 */

package sec01;

public class VaribleScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		if( v1 > 10 ) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; // v2 변수를 사용할수 없기 때문에 컴파일 에러 발생
		System.out.println(v3);
	}
}