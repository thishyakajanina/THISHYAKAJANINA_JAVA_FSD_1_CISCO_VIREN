package cisco.java.program.assignment;

class Vehicle{
	int speed;    
	long distance;
	public Vehicle(int b,long l){	
		speed = b;
		distance = l; 
	}
	public void fuel(int a){
		System.out.println("The fuel value is :"+a);
		
	}
	public void fuel(float b,String s){
		System.out.println("The fuel value is :"+b+"	Name : "+s);
		
	}
	public void fuel(char c,int d){
		System.out.println("The fuel value is : "+d+ "	Name : "+c);
	}
	
	void run(){
	System.out.println("running....");	
	}
	void stop(){
		System.out.println("Stopping....");
	}
	void display(){
	System.out.println("Parent Vehicle Details	speed is:"+speed+" distance is: "+distance); 
	}
}
class TwoWheel extends Vehicle{
	public TwoWheel(int b,long l) {
		super(b,l);
		speed=b;
		distance=l;
	}
	
	int speed;
	long distance;
	int nos_of_tyre =2;
	
	
	void run(){
		System.out.println("-----------------running	TwoWheel------------------");
	}
	void display(){
		System.out.println("The value of  "+nos_of_tyre+" wheel is: Speed:"+speed+" Distance : "+distance);
		super.display();
	}
	void stop(){
		System.out.println("--------------------Stopping	TwoWheel----------------");
	}

}
class ThreeWheel extends Vehicle{
	public ThreeWheel(int b,long l) {
		super(b,l);
		speed=b;
		distance=l;
	}
	
	int speed;
	long distance;
	int nos_of_tyre =3;
	void run(){
		System.out.println("------------------running	ThreeWheel-------------");
	}
	void stop(){
		System.out.println("-------------------Stopping	ThreeWheel-------------");
	}
	void display(){
		System.out.println("The value  "+nos_of_tyre+" wheel is: Speed:"+speed+" Distance : "+distance);
		super.display();
		
	}
}
class FourWheel extends Vehicle{
	public FourWheel(int b,long l) {
		super(b,l);
		speed=b;
		distance=l;
	}
	
	int speed;
	long distance;
	int nos_of_tyre =4;
	void run(){
		System.out.println("-----------------running	FourWheel ---------------");
	}
	void stop(){
		System.out.println("------------------Stopping	FourWheel -----------------");
	}
	void display(){
		System.out.println("The value : "+nos_of_tyre+" wheel id: Speed:"+speed+" Distance : "+distance);
		super.display();
	}
}
class EightWheel extends Vehicle{
	public EightWheel(int b,long l) {
		super(b,l);
		speed=b;
		distance=l;
	}
	
	int speed;
	long distance;
	int nos_of_tyre =8;
	void run(){
		System.out.println("----------------running	EightWheel------");
	}
	void stop(){
		System.out.println("----------------Stopping	EightWheel---------");
	}
	void display(){
		System.out.println("The value of  "+nos_of_tyre+" Wheel is : Speed:"+speed+" Distance : "+distance);
		super.display();
	}

	public static void main(String[] args) {
		Vehicle A=new Vehicle(56,900l);
		TwoWheel B=new TwoWheel(78,890l);
		Vehicle C=new ThreeWheel(67,670l);
		Vehicle D=new FourWheel(98,945l);
		Vehicle E=new EightWheel(26,230l);
		A.fuel(2);
		A.fuel('A', 5);
		A.fuel(2.3f, "Vehicle");
		A.run();
		A.stop();
		A.display();
		B.run();
		B.stop();
		B.display();
		C.run();
		C.stop();
		C.display();
		D.run();
		D.stop();
		D.display();
		E.run();
		E.stop();
		E.display();
		
	}

	}
