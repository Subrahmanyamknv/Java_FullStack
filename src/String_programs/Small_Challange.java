package String_programs;
import java.util.Scanner;
public class Small_Challange 
{
	public static void main(String []args) 
	{
		System.out.println("hello");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		sc.close();
		String s1="";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				for(int j=i-1;; j--)
				{
					s1+=s.charAt(j);
					if(s1.charAt(j)==' ') 
					{
						break;
					}
				}
			}
		}
	}
}
