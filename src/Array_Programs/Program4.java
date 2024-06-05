package Array_Programs;
// no of students in no of classes which are in the school(3_D array)
/*
 *  	school		class	students
 *  	  1			  0			0
 *  							1
 *								2  			
 *  				  1			0
 *  							1
 */
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of School");
		int sch= sc.nextInt();
		int a[][][]= new int [sch][][];

		// collection of the class count
		for( int i=0; i<a.length;i++) {
			System.out.println("Enter the no of claases ");
			a[i]=new int[sc.nextInt()][];
		}
		//collecting the students count
		for( int i=0; i<a.length;i++) {
			System.out.println("IN School:"+(i+1));
			for(int j=0; j<a[i].length;j++) {
				System.out.println("Enter the no of students in class:"+(j+1));
				a[i][j]=new int[sc.nextInt()];
			}
		}
		//collection of marks of student in class
		for( int i=0; i<a.length;i++) {
			System.out.println("IN School:"+(i+1));
			for(int j=0; j<a[i].length;j++) {
				System.out.println(" in class:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the marks of student no: "+(k+1));
					a[i][j][k]=sc.nextInt();
					sc.close();
				}
			}
		}
		//display of marks
		for( int i=0; i<a.length;i++) {
			System.out.println("IN School:"+(i+1));
			for(int j=0; j<a[i].length;j++) {
				System.out.println(" in class:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]);
				}
			}
		}

	}

}
