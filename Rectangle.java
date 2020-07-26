package Assignment5;

public class Rectangle extends Shape{
	double width=1.0;
	double length=1.0;
   
	public Rectangle() {}
	
	public Rectangle(double width,double length) {
		setWidth(width);
		setLength(length);
	}
	public Rectangle(double width,double length,String color,boolean filled) {
		super(color,filled);
		setWidth(width);
		setLength(length);
	}
	public double getArea() {
		double rectangleArea=length*width;
		return rectangleArea;
	}
	public double getPerimeter() {
		double rectanglePeri=2*(length*width);
		return rectanglePeri;
	}
	public String toString() {
		return ("Width=" + width + "\n" +"Length=" + length + "\n" + "Color=" + super.color +"\n"+ "filled=" + super.filled + "\n" + "Rectangle Area=" + getArea() + "\n" + "Rectangle Perimeter=" + getPerimeter());
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

}
