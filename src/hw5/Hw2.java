package hw5;

public class Hw2 {
	static void randAvg() {
		int[] i = new int[10];
		int sum = 0;
		
		
		for (int j = 0; j < 10; j++) {
			i[j] = (int) (Math.random() * 101);
			sum += i[j];
			System.out.print(i[j]+" ");
		}int avg = sum / 10;System.out.print("平均是" + avg);
	}
}
