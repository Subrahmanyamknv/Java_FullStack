package Array_Programs;
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of lag");
		int lan= sc.nextInt();
		System.out.println("enter the no of gon");
		int gon= sc.nextInt();
		System.out.println("enter the no of mov");
		int mov= sc.nextInt();
		long invest= 350000000l;
		long collection=0l;
		long a[][][]= new long [lan][gon][mov];
		for( int i=0; i<a.length;i++) {
			System.out.println("Inside lag:"+(i+1));
			for(int j=0; j<a[i].length;j++) {
				System.out.println("gon:"+(j+1));
				for(int k=0; k<a[i][j].length;k++) {
					System.out.println("Enter the revenue fo the movie"+(k+1));
					a[i][j][k]=sc.nextLong();
					collection= collection+a[i][j][k];
					sc.close();
				}
				}
		}
		for( int i=0; i<a.length;i++) {
			System.out.println("In lag"+(i+1));
			for(int j=0; j<a[i].length;j++) {
				System.out.println("in genour:"+(j+1));
				for(int k=0; k<a[i][j].length;k++) {
					System.out.println("the revenue fo the movie"+(k+1)+" is: "+(a[i][j][k]));
				}
				}
		}
		long profit= collection-invest;
		if (profit>0) {
			System.out.println("he got profit of:"+profit);
		}
		else if(profit==0) {
			System.out.println("he is not profitted or lost");
		}
		else {
			System.out.println("the loss he got is"+profit);
		}
}}
