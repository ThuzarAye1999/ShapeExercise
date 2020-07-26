package Assignment5;

public class Circle extends Shape{
    double radius=1.0;
    
    public Circle() {}
    public Circle(double radius) {
    	this.radius=radius;
    }
	public Circle(double radius,String color,boolean filled) {
    	super(color,filled);
    	this.radius=radius;
    }
    public double getArea() {
    	double carea=3.14*radius*radius;
    	return carea;
    }
    public double getPerimeter() {
    	double cperimeter=2*3.14*radius;
    	return cperimeter;
    }
    public String toString() {
    	return ("Radius=" + radius +"\n" + "Color=" + super.color +"\n"+ "Filled=" + super.filled +"\n"+ "Circle Area=" + getArea() + "\n" + "Circle Perimeter=" + getPerimeter());
    }
	
}
