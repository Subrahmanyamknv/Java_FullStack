package Pattern_programs;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Ether the number");
		int n=sc.nextInt();
		int k;
		for(int i=1;i<=n;i++)
		{
			k=i;
			for(int j=1;j<=n;j++)
			{
				if(k<10) {
					System.out.print("0");
				}
				System.out.print(k+"\t");
				k=k+n;
			}
			System.out.println();
		}
	}
}
