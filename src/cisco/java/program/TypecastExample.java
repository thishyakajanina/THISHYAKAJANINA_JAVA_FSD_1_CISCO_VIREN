package cisco.java.program;

public class TypecastExample {

	public static void main(String[] args) {
		// ----------TYPECAST ----------//
		int i = 100;
		long l =i;
		System.out.println("long value " + l);
		
		int o = (int) l;
		System.out.println("init value "+ o);
		
		char t=(char) i;
		System.out.println("char value"+ t);
		
		//---------DOUBLE------------//
		
       double d =19067453565.0083762575464;
       float r= (float) d;
       System.out.println("float value"+ r);
       System.out.println("double value"+ d);
       
       double d2=100.08;
       long l2=(long)d2;
       int i2=(int)l2;
       System.out.println("Double value"+d2);
       System.out.println("Long value"+l2);
       System.out.println("Int value"+i2);
       
        //-----LONG AND FLOAT--//
       float f=l;
       System.out.println("float value"+f);
       
       //-----BYTE ,INT,DOUBLE------//
       byte b;
       int i1=257;
       double dd=323.987;
       
       System.out.println("conversion of int to byte");
       b=(byte)i1;
       System.out.println("i1= "+i1+" b= "+b);
       System.out.println("conversion of double to byte");
       b=(byte)dd;
       System.out.println("dd = "+dd+ " b= "+b);
       
	}

}
