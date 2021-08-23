package cisco.java.program.assignment;

public class Function {
     public int add(int a,int b){
    	 int c=a+b;
    	 System.out.println("total  :"+c);
    	return c;
}
     public float areaC(float r){
    	 float d= (float) (3.14*r*r);
    	 System.out.println("area of circle :"+d);
    	return d;
}
     public int areaR(int e,int f){
    	 int g=e*f;
    	 System.out.println("area of rectangule  :"+g);
    	return g;
}
     public static void main(String args[]){
    	 Function ob = new Function();
    	 ob.areaC(10.5f);
    	 ob.areaR(3, 4);
    	 ob.add(36, 78);
     }
}
