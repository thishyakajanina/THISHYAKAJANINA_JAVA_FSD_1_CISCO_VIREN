package cisco.java.program.assignment;

class customer{
	int amount=10000;
	synchronized void withdraw(int amount){
		System.out.println("going to withdraw");
		
		if(this.amount<amount){
			System.out.println("less balance :  waiting for deposit...");
			try{
				wait();
			}
			catch(Exception e){}
			}
				this.amount-=amount;
				System.out.println("Withdraw completed .... the remaining amount: "+this.amount);
		}
		synchronized void deposit(int amount){
			System.out.println("going to deposit");
			this.amount+=amount;
			
			System.out.println("deposit completed...."+this.amount);
			notify();
		}
	}

public class Wait_Notify {

	public static void main(String[] args) {
		final customer c =new customer();
		
		new Thread(){
			public void run(){
				c.withdraw(5000);
			}
		}.start();
		
		new Thread(){
			public void run(){
				c.withdraw(4000);
			}
		}.start();
		new Thread(){
			public void run(){
				c.withdraw(10000);
			}
		}.start();
		new Thread(){
			public void run(){
				c.deposit(20000);
			}
		}.start();

	}

}
