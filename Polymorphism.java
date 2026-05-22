package practice;

class Shape{
	public double area() {
		return 0.0;
	}
}
//subclass Rectangle
class Rectangle extends Shape{
	private double width;
	private double hieght;
	
	public Rectangle(double width,double hieght)
	{
		this.hieght=hieght;
		this.width=width;
	}
	@Override
	public double area()
	{
		return width*hieght;
	}
}
//subclass Circle
class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		Shape ref;
		
		ref=new Rectangle(5,10);
		System.out.println("Rectangle Area " +ref.area());
		
		ref=new Circle(5.5);
		System.out.println("Circle Area " +ref.area());
		
	}

}

