package Array_Programs;

//Percentage of no of students in no of classes and dynamic way of student nums for each class
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes");
		int cl= sc.nextInt();
		float a[][]= new float [cl][];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the no of students in class :"+(i+1));
			a[i]= new float[sc.nextInt()];
		}
		for( int i=0; i<a.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0; j<a[i].length;j++) {
				System.out.println("Enter percenage of stu:"+(j+1));
				a[i][j]=sc.nextFloat();
				sc.close();
			}
		}
		for( int i=0; i<a.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0; j<a[i].length;j++) {
				System.out.println("Enter percenage of stu"+(j+1)+" is: "+a[i][j]);
			}
		}
		
	}
}
