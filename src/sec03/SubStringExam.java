package sec03;

public class SubStringExam {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}

//  8 8 0 8 1 5 - 1 2 3 4 5 6 7
// 0 1 2 3 4 5 6 7 8 9 1 0 11 12 13