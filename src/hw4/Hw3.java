//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)
package hw4;

public class Hw3 {
	public static void main(String[] args) {
		String[] str = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int i = 0;
		for (String str1 : str) {
			for (int e = 0; e < str1.length(); e++) {
				char ch = str1.charAt(e);
				switch (ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					i++;
					break;
				}
			}
		}
		System.out.print("陣列裡母音總共有" + i + "個");
	}
}