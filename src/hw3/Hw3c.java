//• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:
package hw3;

import java.util.Scanner;

public class Hw3c {
	public static void main(String[] args) {
		int a;
		int b = 0;
		Scanner x = new Scanner(System.in);
		System.out.println("請輸入不想要的數字(1~9)");
		int c = x.nextInt();
		int[] y = new int[50];
		y[0] = 0;
		for (a = 1; a <= 49; a++) {
			if (a / 10 == c || a % 10 == c) {
				y[a] = 0;
			} else {
				System.out.print(a + " ");
				b++;
				y[a] = a;
			}
			;
		}
		System.out.println();
		System.out.println("總共有" + b + "號碼");
		System.out.print("隨機六個號碼是");
		int r = 0;
		for (int i = 0; i < 6; i++) {
			r = (int) (Math.random() * 49 + 1);
			if (y[r] != 0) {
				System.out.print(y[r] + " ");
				y[r] = 0;
			} else {
				i--;
			}
		}
		
	}
}
