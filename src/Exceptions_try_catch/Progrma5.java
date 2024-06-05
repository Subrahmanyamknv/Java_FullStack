package Exceptions_try_catch;

import java.util.Scanner;
//try with direct only finally
public class Progrma5 {
	public static void main(String []args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter n1");
			int n1= sc.nextInt();//critical statement
			System.out.println("enter n2");
			int n2= sc.nextInt();//critical statement
			int res= n1/n2;//critical statement
			System.out.println(res);
			System.out.println("divition ended");
			System.out.println("enter size for a array");
			int size= sc.nextInt();//critical statement
			int a[]=new int[size];
			System.out.println("enter the position");
			int pos=sc.nextInt();//critical statement
			System.out.println("enter element");
			int ele=sc.nextInt();//critical statement
			sc.close();
			a[pos]=ele;
			System.out.println("array operation completed");
		}
		finally {
			System.out.println("final block");
		}
	}
}
