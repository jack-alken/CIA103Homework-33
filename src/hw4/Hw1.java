//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)

package hw4;

public class Hw1 {
	public static void main(String[] args) {
		int a[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		
		int b = 0;
		int c = 0;
		for (b = 0; b < a.length; b++) {
			c += a[b];
		}
		int avg = c / a.length;
		System.out.println("平均為" + avg);

		for (b = 0; b < a.length; b++)
			if (a[b] > avg)
				System.out.println(a[b]);
	}
}
