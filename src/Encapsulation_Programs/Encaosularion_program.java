package Encapsulation_Programs;

class Dog1
{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	//generic setters
	void setData(String a, String b, int c, int d, String e)
	{
		name = a;
		color = b;
		cost = c;
		age = d;
		breed = e;
	}
	//generic getters
	void getData()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
	}
}
	public class Encaosularion_program
	{
		public static void main(String[] args)
		{
			Dog1 d1 = new Dog1();
			//d1.name = "rocky";   //Error
			d1.getData();
			System.out.println("");
			d1.setData("Rocky", "White", 40000, 4, "GR");
			d1.getData();
			}
		}
