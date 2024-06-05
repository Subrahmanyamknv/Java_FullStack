package Collection_Frameworks;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

public class Array_List_ {
public static void main(String[] args) {
	ArrayList a= new ArrayList();
	a.add(100);
	a.add(200);
	a.add(400);
	a.add(300);// add() method will add the data to the collection
	a.add("For who");
	a.add('S');
	System.out.println(a);
	ArrayList a1= new ArrayList();
	a1.add(200);
	a1.add(700);
	//a.add(a1);
	//System.out.println(a);
	a.addAll(a1);
	System.out.println(a);
	//a.clear();//it delet the content of a
	a.contains(200);//checks if the number is present or not
	System.out.println(a.equals(a1));//are they equal or not
	System.out.println(a.getClass());//tells which class does the a comes under
	System.out.println(a.get(3));//gives the element at the position
	System.out.println(a.indexOf(400));//gives the index of the element we want
	System.out.println(a.isEmpty());//tells is the arrylist empty or not
	System.out.println(a.lastIndexOf(200));//tells when was the element lasstly occured
	System.out.println(a);
	a.remove(3);//removes the element at the position
	System.out.println(a);
	a.set(0, 200);//replaces with the given element at given postion
	System.out.println(a);
	List l=a.subList(0, 6);//gives the sublist of elements 
	System.out.println(l);	
	System.out.println(a1.size());
	a1.add(700);
	System.out.println(a1.size());
	}
}
