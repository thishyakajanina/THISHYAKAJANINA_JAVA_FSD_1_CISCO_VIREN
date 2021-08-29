package cisco.java.program.Stringex;


class Table {
	void printTable(int n){
		System.out.println("I am into this print table method");
	
	 synchronized (this){
		 for (int i=0;i<5;i++){
			 System.out.println(n*i);
			 try{
				 Thread.sleep(400);
			 }
			 catch (Exception e){
				 System.out.println(e);
			 }
		 }
	 }
	}
	}
	class MyThread extends Thread 
	{
		Table t;
		MyThread (Table t){
			this.t=t;
		}
	@Override
		public void run(){
			System.out.println("Into the Mythread run() method 1");
			t.printTable(5);
		}
	}
	class MyThread1 extends Thread 
	{
		Table t;
		MyThread1 (Table t){
			this.t=t;
		}
	@Override
		public void run(){
			System.out.println("Into the Mythread run() method 2");
			t.printTable(100);
		}
	}
public class TestSyn {
	public static void main(String args[]){
		Table obj=new Table();
		MyThread t1= new MyThread(obj);
		MyThread1 t2=new MyThread1(obj);
		
		t1.start();
		t2.start();
	}
}
