package Collection_Frameworks;
import java.util.ArrayList;
import java.util.Collections;
//Collections-Class and the fuctions in it
public class Collection_class_program {
public static void main(String[] args) {
	ArrayList<Integer> a2= new ArrayList<Integer>();
	a2.add(100);
	a2.add(200);
	a2.add(400);
	a2.add(300);
	a2.add(8);
	a2.add(7);
	a2.add(400);
	a2.add(400);
	a2.add(400);
	Collections.sort(a2);
	System.out.println(a2);
	System.out.println(Collections.frequency(a2,400));
	System.out.println(Collections.binarySearch(a2, 7));
	//can go throw the all possible methods
	Collections.reverse(a2);
	System.out.println(a2);
	}
}