package Threading_programs;
import java.util.Scanner;
//
public class program1 {
public static void main(String []args) {
	try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the acc no");
		int acc=sc.nextInt();
		System.out.println("Enter the pin no");
		int pin=sc.nextInt();
		System.out.println("taking things are over");
		
		System.out.println("printing process starts");
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
			Thread.sleep(3000);
		}
		System.out.println("printing process over");
		
		System.out.println("mul activity");
		System.out.println("Enter the number 1");
		int num1= sc.nextInt();
		System.out.println("Enter the number 2");
		int num2= sc.nextInt();
		int res=num1*num2;
		System.out.println(res);
		System.out.println("mul activity over");
		sc.close();
	}
	catch(Exception e){
		System.out.println("done handling");
	}
}
}
