package Collection_Frameworks;
import java.util.ArrayList;
import java.util.Collections;
class Cricketer implements Comparable<Cricketer>
{
    String name;
    String country;
    int matches;
    int runs;
    int wickets;
    public Cricketer(String name, String country, int matches, int runs, int wickets)
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
    @Override
    public int compareTo(Cricketer y) {
    	if(this.wickets<y.wickets)
    	{
    		return 1;
    	}
    	else {
    		return -1;
    	}
    }
}

public class Comparable_using_sort {

    public static void main(String[] args)
    {
        Cricketer c1 = new Cricketer("M.S.Dhoni", "India", 150, 15000, 50);
        Cricketer c2 = new Cricketer("Warner", "Australia", 120, 6700, 5);
        Cricketer c3 = new Cricketer("Babar", "Pakisthan", 100, 5600, 3);
        Cricketer c4 = new Cricketer("Balayya", "World", 500, 500000, 500);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    ArrayList<Cricketer> al = new ArrayList<Cricketer>();
    {
        al.add(c1);
        al.add(c2);
        al.add(c3);
        al.add(c4);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
}