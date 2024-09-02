package hw5;

import java.util.Scanner;

public class Hw1test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = scanner.nextInt();

		System.out.print("Enter height: ");
		int height = scanner.nextInt();

		Hw1.starSquare(width, height);

		scanner.close();
	}

	
 }

