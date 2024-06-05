package Pattern_programs;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Ether the number");
		int n=sc.nextInt();
		int i=0;
		for(i=0;i<n;i++)
		{
			//System.out.println("#"); // # in every single line
			System.out.print("# ");		// # continous in same line 
		}
	}

}
