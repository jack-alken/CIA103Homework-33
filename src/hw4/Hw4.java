package hw4;

import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入想借多少");
		int s = sc.nextInt();
		int i;
		int j = 0;
		int[][] array = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		System.out.print("可以借款的有");	sc.close();
		for (i = 0; i < array[0].length; i++) {
			if (array[1][i] >= s) {
				j++;
				System.out.print(array[0][i] + " ");
			}

		}
		System.out.print("共" + j + "個人");
	
	}
}