package sec06;

public class ForContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; // 반복문 위로 올라감
			}
			System.out.print(i + " "); // + " " <- 띄워쓰기
		}
	}
}