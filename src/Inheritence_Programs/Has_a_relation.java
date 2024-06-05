package Inheritence_Programs;

class Heart{
	int no_of_beats;
	int no_of_valves;
	
	public Heart(int no_of_beats, int no_of_valves) {
		super();
		this.no_of_beats = no_of_beats;
		this.no_of_valves = no_of_valves;
	}
	public int getNo_of_beats() {
		return no_of_beats;
	}
	public int getNo_of_valves() {
		return no_of_valves;
	}
}
class Brain{
	int iq_score;
	long size;
	public Brain(int iq_score, long size) {
		super();
		this.iq_score = iq_score;
		this.size = size;
	}
	public int getIq_score() {
		return iq_score;
	}
	public long getSize() {
		return size;
	}
}

class Book{
	String book_name;
	int cost;
	public String getBook_name() {
		return book_name;
	}
	public int getCost() {
		return cost;
	}
	public Book(String book_name, int cost) {
		super();
		this.book_name = book_name;
		this.cost = cost;
	}
}
class Bike{
	String bike_name;
	int milage;
	public Bike(String bike_name, int milage) {
		super();
		this.bike_name = bike_name;
		this.milage = milage;
	}
	public String getBike_name() {
		return bike_name;
	}
	public int getMilage() {
		return milage;
	}
}
class Human{
	Heart h= new Heart(72,4);
	Brain b= new Brain(110,45);
	void hasBike(Bike bk) {
		System.out.println(bk.getBike_name());
		System.out.println(bk.getMilage());
	}
	void hasBook(Book bo) {
		System.out.println(bo.getBook_name());
		System.out.println(bo.getCost());
	}
}
public class Has_a_relation {
public static void main(String []args) {
	Human hu =new Human();
	Book bok= new Book("tell",120);
	Bike bik =new Bike("Royal",200000);
	System.out.println("Details of heart");
	System.out.println(hu.h.getNo_of_beats());
	System.out.println(hu.h.getNo_of_valves());
	System.out.println("-------------");
	System.out.println("De of Brain");
	System.out.println(hu.b.getIq_score());
	System.out.println(hu.b.getSize());
	System.out.println("------------------");
	System.out.println("De of Bike:");
	hu.hasBike(bik);
	System.out.println("-------------");
	System.out.println("De of Book:");
	hu.hasBook(bok);
	System.out.println("-------------");
	hu=null;
	System.out.println("-------------human is dead-------------");
	System.out.println("Detail of Bike: ");
	System.out.println(bik.getBike_name());
	System.out.println(bik.getMilage());
	
}
}
