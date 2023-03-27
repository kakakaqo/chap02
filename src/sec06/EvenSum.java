package sec06;

public class EvenSum {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
			if (i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.println(" 1~10 2의배수의 합 : " + sum1);
		System.out.println(" 1~10 3의배수의 합 : " + sum2);
	}
}

// ctrl + a 하고 crtl + shift + f = 자동으로 줄맞춰줌