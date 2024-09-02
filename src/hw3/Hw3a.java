package hw3;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:
import java.util.Scanner;

public class Hw3a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		System.out.println("請輸入三角形邊長:");
		if (sc.hasNextInt()) {
			x[0] = sc.nextInt();
			x[1] = sc.nextInt();
			x[2] = sc.nextInt();
			int a = x[0];
			int b = x[1];
			int c = x[2];

			if (a + b > c && b + c > a && a + c > b) {
				if (a == b && b == c) {
					System.out.print("這是正三角形");
				} else if (a == b || b == c || a == c)
					System.out.print("這是等腰三角形");
				else if ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
						|| (Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2)
								|| (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)))))
					System.out.print("這是直角三角形");
				
				else {
					System.out.print("這是其他三角形");
				}
			}else if (a + b < c || b + c < a || a + c < b)
				System.out.print("這不是三角形");
		}
	}
}
