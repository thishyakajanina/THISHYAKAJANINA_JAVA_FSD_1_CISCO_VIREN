package cisco.java.program.exception;
class Operation{
	int square (int n){
		return n*n;
	}
}
public  class AggregationExample {
	Operation op;
	double pi=3.14;
	
	double area(int radius){
		op= new Operation();
		int tsquare = op.square(radius);
		return pi*tsquare;
	}
	public static void main(String[] args) {
		AggregationExample c =new AggregationExample();
		double result = c.area(5);
		System.out.println(result);

	}

}
