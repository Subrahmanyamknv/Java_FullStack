package Encapsulation_Programs;

class Calci
{

int add(int a, int b)
{
    return a+b;
}
float add(float a, float b)
{
    return a+b;
}
double add(double a, double b)
{
    return a+b;
}
float add(int a, float b)
{
    return a+b;
}
double add(int a, double b)
{
    return a+b;
}
double add(float a, double b)
{
    return a+b;
}
int add(int a, int b, int c)
{
    return a+b+c;
}
float add(int a, float b, int c)
{
    return a+b+c;
}
double add(int a, float b, double c)
{
    return a+b+c;
}
}
public class Program1 {

	public static void main(String[] args) {

	    int a=10, b=20, c=30;
	    float m=10.7f, n=20.7f, o=30.7f;
	    double p=100.45, q=200.45, r=300.45;
	    Calci c1 = new Calci();
	    System.out.println(c1.add(a,b));
	    System.out.println(c1.add(m,n));
	    System.out.println(c1.add(p,q));
	    System.out.println(c1.add(a,m,b));

	}

}
