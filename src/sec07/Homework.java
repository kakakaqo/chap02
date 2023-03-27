package sec07;

public class Homework {
	public static String getScoreName(String[] names, int[] scores) {
		String max_name = " ";
		int sum = 0;
		int max = 0;
		int idx = 0;
		
		for(int i = 0; i < scores.length; i++  ) {
			sum += scores[i];
		}
		double avg = (double) sum / scores.length;
		System.out.printf("평균점수는 \" %.1f 점 \"  ",avg);
		
		for(int q = 0; q < scores.length; q++  ) {
			if( scores[q] > max ) {
			max = scores[q];
			idx = q;
			}
		}
		
		System.out.println();
		System.out.println("최고점은 \" " + max + "점\"입니다.");
		max_name = names[idx];
		return max_name;
	}
	
	public static void main(String[] args) {
		String[] names = { "최태원", "이경선", "배준섭", "홍원표", "김성현", "우상현", "심미인"};
		int[] scores = new int [] { 87, 95, 100, 65, 70, 84, 69 };
		System.out.println("최고성적은 " + getScoreName(names, scores) + " 님 입니다.");
	}
}
