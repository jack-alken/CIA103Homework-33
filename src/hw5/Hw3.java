package hw5;

public class Hw3 {

	public static int maxElement(int[][] x) {
		int max = 0;
		if (x == null || x.length == 0 || x[0].length == 0) {
			throw new IllegalArgumentException("陣列不存在");
		}
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				max = x[0][0];
				if (max < x[i][j])
					max = x[i][j];
			}

		}
		return max;
	}

	public static double maxElement(double[][] x) {
		double max = 0;
		if (x == null || x.length == 0 || x[0].length == 0) {
			throw new IllegalArgumentException("陣列不存在");
		}
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				max = x[0][0];
				if (max < x[i][j])
					max = x[i][j];
			}

		}
		return max;
	}
	
}
