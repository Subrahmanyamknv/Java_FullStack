package Exceptions_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Progrma2 {
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
			a[pos]=ele;
			System.out.println("array operation completed");
		}
		catch(ArithmeticException e1) {
				System.out.println("okay got it");
		}//multiple catchs
		catch(InputMismatchException e2) {
				System.out.println("it is done");
		}
		catch(NegativeArraySizeException e3) {
				System.out.println("ha ");
		}
		catch(Exception e) {
			//System.out.println(e);
			System.out.println("okok");
		}
	}
}
