package Abstact_programs;

abstract class Plane1{
	void takeOff() {
		System.out.println("Plane took off");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane landed");
	}
}
class FighterPlane extends Plane1{
	@Override
	void fly(){
		System.out.println("Fighter planes fly at great hights");
	}
	
}
public class Program1st {
	public static void main(String []args) {
		FighterPlane fp= new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();
		//Plane1 p= new Plane1();// error cannot create object for abstract classes directly
		Plane1 p1 = new Plane1() {
			@Override
			void fly() {
				System.out.println("Plane id flying from main");
			}
		};
		p1.fly();
	}
}
