package sec07;

public class Array14StringPrint {
	public static void main(String[] args) {
		String[] members = { "최진형", "이성준", "최기선" };
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i] + "님이 상담을 받았습니다.");
			// System.out.println("%s 님이 상담을 받았습니다. \n", members[i]);

		}
		System.out.println();
		for (String string : members) {
			System.out.printf("%s 님이 상담을 받았습니다.\n", string);
			// System.out.println(string + "님이 상담을 받았습니다.");
		}
	}
}