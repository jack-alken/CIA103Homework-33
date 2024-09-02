//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//對則顯示正確訊息,如圖示結果:

package hw3;

import java.util.Scanner;

public class Hw3b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧! 請輸入整數");
		int i = (int) (Math.random() * 101);
		int x;
		x = sc.nextInt();
		while (x != i) {
			if (x > i) {
				System.out.println("猜錯了,再猜小一點!");
			}
			if (x < i) {
				System.out.println("猜錯了,再猜大一點!");
			}
			x = sc.nextInt();
		}
		System.out.print("猜對了答案就是" + i);
	}
}
