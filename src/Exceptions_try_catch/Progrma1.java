package Exceptions_try_catch;
import java.util.Scanner;
public class Progrma1 {
public static void main(String []args) {
	try {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n1");
		int n1= sc.nextInt();
		System.out.println("enter n2");
		int n2= sc.nextInt();
		int res= n1/n2;
		System.out.println(res);
	}
	catch(Exception e) {
		//System.out.println(e);
		System.out.println("okok");
	}
}
}
