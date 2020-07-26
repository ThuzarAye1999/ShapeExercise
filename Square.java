package Assignment5;

public class Square extends Rectangle{
	
	public Square() {}
	public Square(double side) {
		this.width=side;
		this.length=side;
	}
	public Square(double side,String color,boolean filled) {
		color=super.color;
		filled=super.filled;
		this.width=side;
		this.length=side;
	}
	public void setWidth(double side) {
		side=super.getWidth();
	}
	public void setLength(double side) {
		side=super.getLength();
	}
	public void display() {
	 System.out.println("Square Width=" + width );
	 System.out.println("Square Length=" + length);
	 System.out.println("Square Color=" + color);
	 System.out.println("Square filled=" + filled);
     System.out.println("Square Area=" + super.getArea());
     System.out.println("Square Perimeter=" + super.getPerimeter());
	}

}
