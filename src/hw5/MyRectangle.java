package hw5;

public class MyRectangle {
	private double width;
	private double depth;

	public MyRectangle() {
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		return width * depth;
	}

	public static void main(String[] args) {
		MyRectangle Area = new MyRectangle();
		Area.setWidth(10);
		Area.setDepth(20);
		System.out.println(Area.getArea());

		MyRectangle Area2 = new MyRectangle(10, 20);

		System.out.print(Area2.getArea());

	}
}
