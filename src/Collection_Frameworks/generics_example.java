package Collection_Frameworks;

import java.util.ArrayDeque;

public class generics_example {
	public static void main(String args[]) {
ArrayDeque<Integer> a= new ArrayDeque<Integer>();
a.add(3);
//a.add("hello");//error only integer only 
a.addFirst(6);
System.out.println(a);
a.addLast(7);
System.out.println(a);
System.out.println(a.peek());
}
}