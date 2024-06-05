package Exceptions_try_catch;

import java.util.Scanner;
//throws exception example
class C1{
	void code1() throws Exception{
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
}
class C2{
	void code2() throws Exception{
		System.out.println("code 2 enter");
		C1 e= new C1();
		e.code1();
		System.out.println("code 2 left");
	}
}
class C3{
	void code3(){
		try {
			System.out.println("code 3 enter");
		C2 f= new C2();
		f.code2();
		}
		catch(Exception j){
			System.out.println(j);
		}
		System.out.println("code 3 left");
	}
}
public class Progrma6 {
	public static void main(String []args) {
		System.out.println("main enter");
		C3 g= new C3();
		g.code3();
		System.out.println("main left");
	}}
