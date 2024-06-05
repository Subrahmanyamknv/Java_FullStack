package Collection_Frameworks;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterations_in_java {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		System.out.println(ll);
		System.out.println("-----------------------");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("-----------------------");
		for(Object x : ll) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		Iterator itr = ll.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------");
		Iterator itr1 = ll.descendingIterator();
		while(itr1.hasNext()==true) {
			System.out.println(itr1.next());
		}	

		
	}

}
