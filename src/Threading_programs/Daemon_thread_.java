package Threading_programs;

class MSOffice1 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("spellCheck")) {
			spellCheck();
		}
		else {
			saving();
		}
	}
	//identifing the primary thread
	private void typing() {
		try{
			for(int i=1;i<=5;i++) {
			System.out.println("typing");
			Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	private void spellCheck() {
		try{
			for(;;) {
			System.out.println("Spell checking");
			Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	private void saving() {
		try{
			for(;;) {
			System.out.println("Saving");
			Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class Daemon_thread_ {
	public static void main(String args[]) {
		MSOffice1 ms1 = new MSOffice1();
		ms1.setName("typing");
		MSOffice1 ms2 = new MSOffice1();
		ms2.setName("spellCheck");
		ms2.setPriority(8);
		ms2.setDaemon(true);
		MSOffice1 ms3 = new MSOffice1();
		ms3.setName("saving");
		ms3.setPriority(9);
		ms3.setDaemon(true);
		ms1.start(); 
		ms2.start();
		ms3.start();
	}
}
