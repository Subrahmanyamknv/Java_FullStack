package PolymorphisumPrograms;

class Plane1 {
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
class CargoPlane1 extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo plane fly at low hights");
	}
	void carryGoods() {
		System.out.println("Cargo plane carries Goods");
	}
}
class PassengerPlane1 extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane fly at medium hights");
	}
	void carryPeople() {
		System.out.println("Passenger plane carries People");
	}
}
class FighterPlane1 extends Plane{
	@Override
	void fly() {
		System.out.println("Figeter plane fly at hig extrem hights");
	}
	void carryWepons() {
		System.out.println("Cargo plane carries Wepons");
	}
	
}
class AirPort{
	void permit(Plane ref) {
		ref.TakeOff();
		ref.fly();
		ref.land();
	}
}
public class CondencedPloymorphisumProgrsm {
	public static void main(String[] args) {
		CargoPlane1 cp= new CargoPlane1();
		PassengerPlane1 pp= new PassengerPlane1();
		FighterPlane1 fp= new FighterPlane1();
		AirPort ap=new AirPort();
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("----------------------");
		ap.permit(pp);
		pp.carryPeople();
		System.out.println("----------------------");
		ap.permit(fp);
		fp.carryWepons();
		System.out.println("----------------------");
				}}

