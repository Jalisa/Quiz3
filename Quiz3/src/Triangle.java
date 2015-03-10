public class Triangle extends GeometricObject {
	
	// values 1.0
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// No-arg constructor
	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	
	public double getArea() {
		double x = getPerimeter() / 2;
		return Math.sqrt(x * ((x - side1) * (x - side2) * (x - side3)));
	}

	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// String method that returns a string description for the triangle
	public String toString() {
		return "Area = " + String.format("%.2f", getArea()) + "; Perimeter = "
				+ String.format("%.2f", getPerimeter());
	}
}
