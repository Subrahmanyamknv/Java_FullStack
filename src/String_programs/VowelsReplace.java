package String_programs;

import java.util.Scanner;
public class VowelsReplace {
			public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				System.out.println("enteer the string");
				String s1= sc.nextLine();
				s1=s1.toUpperCase();
				for(int i=0;i<s1.length();i++) {
					if(s1.charAt(i)=='A'|| s1.charAt(i)=='E' || s1.charAt(i)=='I' ||s1.charAt(i)=='O'||s1.charAt(i)=='U')
							{
								s1=s1.replace(s1.charAt(i), '$');
							}
				}
				System.out.println(s1);
			}
	}

