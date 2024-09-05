//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)
package hw4;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入想倒反的字串");
	String str = sc.nextLine();
	String arg = str; 
//		String arg = "Hello World";
		int al = arg.length();
		int i = 0;
		for (i = (al - 1); i >= 0; i--) {
			char ch = arg.charAt(i);

			System.out.print(ch);sc.close();
		}
	}
}
