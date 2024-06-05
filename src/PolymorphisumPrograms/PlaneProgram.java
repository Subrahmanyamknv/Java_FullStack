package PolymorphisumPrograms;

class Plane {
	void TakeOff() {
		System.out.println("Plane Took-Off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo plane fly at low hights");
	}
	void carryGoods() {
		System.out.println("Cargo plane carries Goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane fly at medium hights");
	}
	void carryPeople() {
		System.out.println("Passenger plane carries People");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Figeter plane fly at hig extrem hights");
	}
	void carryWepons() {
		System.out.println("Cargo plane carries Wepons");
	}
	
}
public class PlaneProgram{
	public static void main(String[] args) {
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp= new PassengerPlane();
		FighterPlane fp= new FighterPlane();
		Plane ref;
		ref=cp;
		cp.carryGoods();
		ref.fly();
		ref.TakeOff();
		System.out.println("----------------------");
		ref=pp;
		pp.carryPeople();
		ref.fly();
		ref.TakeOff();
		System.out.println("----------------------");
		ref=fp;
		fp.carryWepons();
		ref.fly();
		ref.TakeOff();
		System.out.println("----------------------");
				}}
