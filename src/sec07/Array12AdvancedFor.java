package sec07;

public class Array12AdvancedFor {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		// 배열 항목 전체합 구하기
		int sum = 0;
		for (int score : scores) { // 향상된 for 문
			//sum = sum + score;
			 sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		// 배열 항목 저네 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}