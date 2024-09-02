package hw5;

public class Hw5 {
	public static void main(String[] args) {
		System.out.println(genAuthCode());
	}

	public static String genAuthCode() {
		int r;
		char ch;
		String authCode = "";

		for (int i = 0; i < 8; i++) {
			do {
				r = (int) (Math.random() * 123);
				ch = (char) r;
			} while (r < '0' || (r > '9' && r < 'A') || (r > 'Z' && r < 'a') || r > 'z');
			authCode += ch;
		}
		return authCode;
	}
}