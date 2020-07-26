package Assignment5;

public class ShowInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape s;
        s=new Rectangle();
        System.out.println("For Shape");
        System.out.println(s.showShape());
        System.out.println();
        System.out.println("For Rectangle");
        System.out.println(s.toString());
        System.out.println();
        s=new Circle();
        System.out.println("For Circle");
        System.out.println(s.toString());
        System.out.println();
        System.out.println("For Square");
        Square r=new Square();
        r.display();
	}

}
