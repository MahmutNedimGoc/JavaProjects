
public class Test{
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(40);
		rectangle.setWidth(4);
		System.out.println("Area: "+rectangle.getArea());
		System.out.println("Perimeter: "+ rectangle.getPerimeter());
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setHeight(3.5);
		rectangle1.setWidth(35.9);
		System.out.println("Area: "+rectangle1.getArea());
		System.out.println("Perimeter: "+ rectangle1.getPerimeter());
	}
}