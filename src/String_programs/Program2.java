package String_programs;

public class Program2 {
	public static void main(String args[])
	{
		String s1=new String("Rama");
		String s2=new String("RAMA");
		int res=s1.compareToIgnoreCase(s2);
		System.out.println(res);//compares the stings based on ignoring the lower case or upper case the ascie values and gives the difference in numbers
		if(res==0) {
			System.out.println("String are equal");
		}
		else {
			System.out.println("string not equal");
		}
		if(s1==s2) {
			System.out.println("Address is equal");
		}
		else{
			System.out.println("Address is not equal");
		}
	}

}
