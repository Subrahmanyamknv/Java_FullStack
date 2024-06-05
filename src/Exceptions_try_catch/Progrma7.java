package Exceptions_try_catch;

import java.util.Scanner;
//re--throwing the exceptions
class C0{
	void code1() throws Exception{
		try{
		System.out.println("code 1 enter");
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
		System.out.println("code 1 left");
		}
		catch(Exception j){
			System.out.println("Eception handleded in code1");
			throw j;
		}
	}
}
public class Progrma7 {
	public static void main(String []args) {
		System.out.println("main enter");
		try {
			C0 i= new C0();
			i.code1();
		}
		catch(Exception r) {
			System.out.println("Exception also handlend in main");
		}
		System.out.println("main left");
	}}