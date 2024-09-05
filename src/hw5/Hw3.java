package hw5;

public class Hw3 {

	
	public static void main(String[] args) {
		int[][] A1 = {{1,2,3},{4,5,6}};
		double[][] A2 = {{1.1,1.2,1.3},{1.4,1.5,1.6}};
		System.out.println(Hw3.maxElement(A1));
		System.out.println(Hw3.maxElement(A2));
		
		
		
	}
	
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
