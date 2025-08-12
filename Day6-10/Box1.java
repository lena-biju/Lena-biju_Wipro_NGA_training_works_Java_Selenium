package pack1;

public class Box1<T> {
	private T item;
	public void set(T item) {
		this.item = item;
	}
	public T get() {
		return item;
	}
}

class Main {
	public static void main(String[] args) {
		Box1<Integer> rectLen = new Box1<>(); // area of rectangle
		Box1<Integer> rectBre = new Box1<>();

		rectLen.set(5);
		rectBre.set(3);

		int rectArea = rectLen.get() * rectBre.get();
		System.out.println("Area of Rectangle: " + rectArea);

		Box1<Double> radius = new Box1<>(); // area of circle
		radius.set(2.0);
		double circleArea = 3.141 * radius.get() * radius.get();
		System.out.println("Area of Circle: " + circleArea);

		Box1<Float> squareSide = new Box1<>(); // perimeter of square
		squareSide.set(4.5f);
		float squarePerimeter = 4 * squareSide.get();
		System.out.println("Perimeter of Square: " + squarePerimeter);

		Box1<Double> triBase = new Box1<>(); // area of triangle
		Box1<Double> triHeight = new Box1<>();
		triBase.set(6.0);
		triHeight.set(3.0);
		double triArea = 0.5 * triBase.get() * triHeight.get();
		System.out.println("Area of Triangle: " + triArea);

		Box1<String> output = new Box1<>(); // display
		output.set("Output of above assessment questions");
		System.out.println(output.get());
	}
}
