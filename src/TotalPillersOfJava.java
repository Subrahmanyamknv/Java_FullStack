import java.util.Scanner;
abstract class Shapes{
	double area;
	abstract void collect();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}
class Circle extends Shapes{
	final private double pi=3.14768;
	private double r;
	@Override
	void collect() {
		Scanner sc= new Scanner(System.in);
		r=sc.nextDouble();	
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	void calculate() {
		area=pi*r*r;
	}
}
class Square extends Shapes{
	private double side;
	@Override
	void collect() {
		Scanner sc= new Scanner(System.in);
		side=sc.nextDouble();	
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	@Override
	void calculate() {
		area=side*side;
		
	}
}
class Rectangle extends Shapes{
	private double l,b;
	@Override
	void collect() {
		Scanner sc= new Scanner(System.in);
		l=sc.nextDouble();
		b=sc.nextDouble();
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	@Override
	void calculate() {
		area=l*b;
		System.out.println("area of rec: ");
	}
}
class Geometry {
	void permit(Shapes s) {
		s.collect();
		s.calculate();
		s.display();
	}
}

public class TotalPillersOfJava {
public static void main(String []args) {
	Circle c= new Circle();
	Square s1=new Square();
	Rectangle r= new Rectangle();
	Geometry g= new Geometry();
	System.out.println("circle give r");
	g.permit(c);
	System.out.println("give l and then b");
	g.permit(r);
	System.out.println("give side for square");
	g.permit(s1);
}
}
