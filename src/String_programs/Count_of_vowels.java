package String_programs;

import java.util.Scanner;
public class Count_of_vowels {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enteer the string");
			String s1= sc.nextLine();
			s1=s1.toUpperCase();
			int c=0;
			int a=0,e=0,I=0,o=0,u=0;
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)=='A') 
				{a++;} 
				else if(s1.charAt(i)=='E') 
				{e++;} 
				else if( s1.charAt(i)=='I') 
				{I++;} 
				else if(s1.charAt(i)=='O') 
				{o++;}
				else if(s1.charAt(i)=='U') 
				{u++;}
				else {
					c++;}
			}
			System.out.println("a count: "+a);
			System.out.println("e count: "+e);
			System.out.println("i count: "+I);
			System.out.println("o count: "+o);
			System.out.println("u count: "+u);
			System.out.println("con count: "+c);
		}
}
