public class Rectangle {
	double width = 1;
	double height = 1;
	double area;
	double perimeter;
	public Rectangle() {
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return area = width*height;
	}
	public double getPerimeter() {
		return perimeter = 2*(width+height);
	}
}
