package pack1;

public class GeometryGeneric<T> {
	private T length;
	private T breadth;
	private T radius;

	public void setLength(T length) { this.length = length; }
	public void setBreadth(T breadth) { this.breadth = breadth; }
	public void setRadius(T radius) { this.radius = radius; }

	
	public T getLength() { return length; }
	public T getBreadth() { return breadth; }
	public T getRadius() { return radius; }
class Main{
	public static void main(String[] args) {
		GeometryGeneric<Integer> shapeInt = new GeometryGeneric<>();
		GeometryGeneric<Double> shapeDouble = new GeometryGeneric<>();
		GeometryGeneric<Float> shapeFloat = new GeometryGeneric<>();

		// Rectangle Area
		shapeInt.setLength(10);
		shapeInt.setBreadth(5);
		int rectArea = shapeInt.getLength() * shapeInt.getBreadth();
		System.out.println("Area of Rectangle: " + rectArea);

		// Circle Area
		shapeDouble.setRadius(2.0);
		double circleArea = 3.141 * shapeDouble.getRadius() * shapeDouble.getRadius();
		System.out.println("Area of Circle: " + circleArea);

		// Square Perimeter
		shapeFloat.setLength(4.5f);
		float squarePerimeter = 4 * shapeFloat.getLength();
		System.out.println("Perimeter of Square: " + squarePerimeter);

		// Triangle Area
		shapeDouble.setBreadth(6.0); 
		shapeDouble.setLength(3.0);  
		double triangleArea = 0.5 * shapeDouble.getBreadth() * shapeDouble.getLength();
		System.out.println("Area of Triangle: " + triangleArea);

		
		GeometryGeneric<String> output = new GeometryGeneric<>();
		output.setLength("Output of above assessment questions");
		System.out.println(output.getLength());
	}
}
}
