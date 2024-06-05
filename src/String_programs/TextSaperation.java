package String_programs;

import java.util.Scanner;
public class TextSaperation {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enteer the string");
			String s1= sc.nextLine();
			String alp="",num="",sep="";
			for(int i=0;i<s1.length();i++)
			{
				if((s1.charAt(i)>='A' && s1.charAt(i)<='Z')||(s1.charAt(i)>='a' && s1.charAt(i)<='z'))
				{
					alp=alp+s1.charAt(i);
				}
				else if((s1.charAt(i)>='0' && s1.charAt(i)<='9'))
				{
					num=num+s1.charAt(i);
				}
				else {
					sep=sep+s1.charAt(i);
				}
			}
			System.out.println("Alp: "+alp);
			System.out.println("Num: "+num);
			System.out.println("sep: "+sep);
	}

}