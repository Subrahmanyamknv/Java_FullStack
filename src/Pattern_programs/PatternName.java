package Pattern_programs;

import java.util.Scanner;

public class PatternName {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{//Alphabet_S

			System.out.print("       ");
			for(int j=0; j < n; j++)
            {
                if((i==0 && j!=0) || (i==(n-1) && j!=(n-1)) || (j==0 && i<(n/2) && i!=0) || (j==(n-1) && i>(n/2) && i!=(n-1)) || (i==(n/2) && j!=0 && j!=(n-1)))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
               }
            }
			System.out.print("      ");
			//Alphabet_U
			for(int j=0;j<n;j++)
			{
				if((j==0 && i!=n-1)|| (j==n/2 && i!=n-1) || (i==n-1 && j<n/2 && j!=0)) {
					System.out.print("* ");
				}
				else {

					System.out.print("   ");
				}
			}
			//Alphabet_B
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==0 && j!=n-1)||(i==n/2 && j!=n-1)|| (i==n-1 && j!=n-1)|| (j==n-1 && i!=0 && i!=(n/2) && i!=(n-1))) {
					System.out.print("* ");
				}
				else {

					System.out.print("  ");
				}
			}
			System.out.print("     ");
			//Alphabet_R
			for(int j=0; j < n; j++)
            {
                if(j==0 || (i==0 && j!=(n-1)) || (i==(n/2) && j!=(n-1)) || (j==(n-1) && i<(n/2) && i!=0) || (i==j && i>(n/2)))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
               }
            }

			System.out.print("    ");
			for(int j=0; j < n; j++)
            {//A
                if((i==0 && j!=0 && j!=(n-1)) || i==(n/2) || (j==0 && i!=0) || (j==(n-1) && i!=0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
               }
            }
			System.out.print("      ");
			for(int j=0;j<n;j++)
			{//H
				if(j==0 || j==n-1 || i==n/2) {
					System.out.print("* ");
				}
				else {

					System.out.print("  ");
				}
			}
			System.out.print("     ");
			for(int j=0;j<n;j++)
			{//M
				if(j==0|| j==n-1 || (i==j && i<=n/2 && j<=n/2) || (i+j==n-1 && j>n/2 && i<=n/2) ) {
					System.out.print("* ");
				}
				else {

					System.out.print("  ");
				}
			}
			System.out.print("    ");
			for(int j=0; j < n; j++)
            {//A
                if((i==0 && j!=0 && j!=(n-1)) || i==(n/2) || (j==0 && i!=0) || (j==(n-1) && i!=0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
               }
            }
			System.out.print("      ");
			for(int j=0;j<n;j++)
			{//N
				if(j==0|| j==n-1 || (i==j)) {
					System.out.print("* ");
				}
				else {

					System.out.print("  ");
				}
			}
			System.out.print("     ");
			for(int j=0;j<n;j++)
			{//Y
				if( (i==j && i<=n/2)|| i+j==n-1) {
					System.out.print("* ");
				}
				else {

					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0; j < n; j++)
            {
                if((i==0 && j!=0 && j!=(n-1)) || i==(n/2) || (j==0 && i!=0) || (j==(n-1) && i!=0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
			System.out.print("    ");
			for(int j=0;j<n;j++)
			{//M
				if(j==0|| j==n-1 || (i==j && i<=n/2 && j<=n/2) || (i+j==n-1 && j>n/2 && i<=n/2) ) {
					System.out.print("* ");
				}
				else {

					System.out.print("  ");
				}
			}
			System.out.print("    ");
			System.out.println();
		}

	}
	}
