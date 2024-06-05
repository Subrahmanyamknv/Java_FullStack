package String_programs;

public class Program3 {
//main functions in String Class 
	public static void main(String[] args) {
		String s1= new String("RajaRamMohanRoy");
		System.out.println(s1.charAt(5));
		System.out.println(s1.contains("Raja"));
		System.out.println(s1.endsWith("Roy"));
		System.out.println(s1.startsWith("Ram"));
		System.out.println(s1.getClass());
		System.out.println(s1.indexOf("M"));
		System.out.println(s1.isBlank());
		String s2=new String("siraj subbu");
		System.out.println(s2.isBlank());//Does not care about spaces gives blanks
		System.out.println(s2.isEmpty());// should not contain even a single charecter or spaces
		System.out.println(s1.length());
		String s4= s1.replace("a","$");
		System.out.println(s4);
		String s5= "   HI hello   ";
		System.out.println(s5.strip());
		System.out.println(s5.stripLeading());
		System.out.println(s5.stripTrailing());
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(7,12));
		char[] s7=s1.toCharArray();
		for(int i=0; i<s7.length;i++) {
			System.out.print(s7[i]+",");
		}
	}
}