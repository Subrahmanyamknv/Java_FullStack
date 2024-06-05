package Threading_programs;
//example for multi- threading in notes 
import java.util.Scanner;
class Operations implements Runnable{
	
	Scanner sc= new Scanner(System.in);
	@Override
	public void run(){
		if(Thread.currentThread().getName().equals("typing")) {
			banking();
	}
	else if(Thread.currentThread().getName().equals("spellCheck")) {
		printing();
	}
	else {
		multiplication();
	}
	}

	private void banking() {
		
		
	}

	private void printing() {
		// TODO Auto-generated method stub
		
	}

	private void multiplication() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Program2 {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("main thread started");

		Operations op1 = new Operations(); Thread t1 = new Thread(op1);

		t1.setName("banking");

		Operations op2 = new Operations();

		Thread t2 = new Thread(op2);

		t2.setName("printing"); Operations op3 = new Operations();

		Thread t3 = new Thread(op3);

		t3.setName("multiplication");

		//handing over the threads to Thread - Scheduler

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
}
}
