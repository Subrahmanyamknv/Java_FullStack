package Encapsulation_Programs;

class Dog2
{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//Zero parameters constuctor
	public Dog2() {
		this("HHHH");//goes to the constuctor of 1 parameter
		name="siraj";
		color="red";
		age=20;
		cost=1234;
		breed="dog";
	}
	public Dog2(String name) {
		this("jimmy","brown");////goes to the constuctor of 2 parameter
		this.name=name;
		}
	public Dog2(String name, String color)
	{
		this.name="ttt";
		this.color="Reyy";
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	
	
}
	public class Program2
	{
		public static void main(String[] args)
		{
			Dog2 d1 = new Dog2();
			System.out.println(d1.getName());
			System.out.println(d1.getAge());
			System.out.println(d1.getColor());
			System.out.println(d1.getCost());
			System.out.println(d1.getBreed());
			}
		}
