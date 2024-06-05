package Collection_Frameworks;
import java.util.LinkedList;
public class Linked_list_ {
public static void main(String []args) {
	LinkedList k= new LinkedList();
	k.add(200);//adds the element
	k.add(30);
	System.out.println(k);
	k.add(1, 'u');//adds the element at specified position 
	System.out.println(k);
	System.out.println(k.contains(2));
	k.addFirst(30);
	System.out.println(k);// adds at first position
	k.addLast(40);//adds at the last 
	System.out.println(k);
	System.out.println(k.getFirst());//gives first element 
	System.out.println(k.getLast());//gives last element
	System.out.println(k);
	k.pop();
	System.out.println(k);
	k.push(3000);//pushes the element at first of the linkedlist
	System.out.println(k);
	k.push(3500);
	System.out.println(k);
	k.pop();//removes the element which is at first palce
	System.out.println(k);
	System.out.println(k.size());
	
}
}
