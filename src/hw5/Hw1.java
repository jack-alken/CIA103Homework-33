package hw5;

import java.util.Scanner;

public class Hw1 {
	static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = scanner.nextInt();

		System.out.print("Enter height: ");
		int height = scanner.nextInt();

		starSquare(width, height);
		scanner.close();
	}
}
