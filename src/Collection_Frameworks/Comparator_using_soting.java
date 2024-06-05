package Collection_Frameworks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Cricketer1
{
    String name;
    String country;
    int matches;
    int runs;
    int wickets;
    public Cricketer1(String name, String country, int matches, int runs, int wickets)
    {
        super();
        this.name=name;
        this.country=country;
        this.matches=matches;
        this.runs=runs;
        this.wickets=wickets;
    }
    @Override
    public String toString()
    {
        return name+"---"+country+"---"+matches+"---"+runs;
    }

}
class Beta implements Comparator<Cricketer1>
{
	@Override
	public int compare(Cricketer1 x, Cricketer1 y) {
		if(x.runs>y.runs) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class Comparator_using_soting {

    public static void main(String[] args)
    {
        Cricketer1 c1 = new Cricketer1("M.S.Dhoni", "India", 150, 15000, 50);
        Cricketer1 c2 = new Cricketer1("Warner", "Australia", 120, 6700, 5);
        Cricketer1 c3 = new Cricketer1("Babar", "Pakisthan", 100, 5600, 3);
        Cricketer1 c4 = new Cricketer1("Balayya", "World", 500, 500000, 500);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        Beta b= new Beta();
    ArrayList<Cricketer1> al = new ArrayList<Cricketer1>();
    {
        al.add(c1);
        al.add(c2);
        al.add(c3);
        al.add(c4);
        System.out.println(al);
        Collections.sort(al,b);
        System.out.println();
        System.out.println(al);
    }
}
}
