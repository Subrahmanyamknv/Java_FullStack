package Inheritence_Programs;

class Animal {
	void Eat() {
		System.out.println("Plane Took-Off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane landed");
	}
}
class Carniorse extends Animal{
	@Override
	void fly() {
		System.out.println("Cargo plane fly at low hights");
	}
	void carryGoods() {
		System.out.println("Cargo plane carries Goods");
	}
}
class herbivors extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane fly at medium hights");
	}
	void carryPeople() {
		System.out.println("Passenger plane carries People");
	}
}
class A extends Plane{
	@Override
	void fly() {
		System.out.println("Figeter plane fly at hig extrem hights");
	}
	void carryWepons() {
		System.out.println("Cargo plane carries Wepons");
	}
	
}

public class AnimalsProgram {
	public static void main(String[] args) {
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp= new PassengerPlane();
		FighterPlane fp= new FighterPlane();
		cp.carryGoods();
		cp.fly();
		cp.TakeOff();
		System.out.println("----------------------");
		pp.carryPeople();
		pp.fly();
		pp.TakeOff();
		System.out.println("----------------------");
		fp.carryWepons();
		fp.fly();
		fp.TakeOff();
		System.out.println("----------------------");
}
}
