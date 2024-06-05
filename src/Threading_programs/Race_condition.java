package Threading_programs;
class MSOffice extends Thread{
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
	private void typing() {
		try{
			for(int i=1; i<=5;i++) {
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
			for(int i=1; i<=5;i++) {
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
			for(int i=1; i<=5;i++) {
			System.out.println("Saving");
			Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class Race_condition {
	public static void main(String args[]) {
		MSOffice ms1 = new MSOffice();
		ms1.setName("typing");
		MSOffice ms2 = new MSOffice();
		ms2.setName("spellCheck");
		MSOffice ms3 = new MSOffice();
		ms3.setName("saving");
		ms1.start(); 
		ms2.start();
		ms3.start();
	}
}
