package sec07;

public class Dd {
	public static void main(String[] args) {
		// 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];

		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		int co = 0;
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) { // 반의 수만큼 반복
				if (mathScores[i][k] >= 90) {
					co++; // 이프문 조건이 되면 카운트 해줌 
				}
			}
		}
		System.out.print("90이 넘는 학생의 수 : " + co + "명");
	}
}