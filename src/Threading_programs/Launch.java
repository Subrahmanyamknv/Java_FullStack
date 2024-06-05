package Threading_programs;
class Human extends Thread{ 
	@Override
public void run() {
try { 
	System.out.println(Thread.currentThread().getName()+"entered the bathroom.");
Thread.sleep(3000);
System.out.println(Thread.currentThread().getName()+"using the bathroom.");
Thread.sleep(5000);
System.out.println(Thread.currentThread().getName()+"leaving the bathroom.");
Thread.sleep(5000);
}
catch(Exception e){
	System.out.println(e);
}
	}
}
public class Launch {

		public static void main(String[] args) throws Exception{
		Human h1 = new Human();
		h1.setName("Boy");
		Human h2= new Human();
		h2.setName("Girl");
		Human h3= new Human();
		h3.setName("Othres");
		h1.start();
		h2.start();
		h3.start();

		}
}
