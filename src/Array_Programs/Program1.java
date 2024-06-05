package Array_Programs;

//Percentage of no of students in no of classes
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes");
		int cl= sc.nextInt();
		System.out.println("Enter no of stu in each classes");
		int st= sc.nextInt();
		float a[][]= new float [cl][st];
		for( int i=0; i<a.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0; j<a.length;j++) {
				System.out.println("Enter percenage of stu:"+(j+1));
				a[i][j]=sc.nextFloat();
				sc.close();
			}
		}
		for( int i=0; i<a.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0; j<a.length;j++) {
				System.out.println("Enter percenage of stu"+(j+1)+"is:"+a[i][j]);
			}
		}
		
	}
}
