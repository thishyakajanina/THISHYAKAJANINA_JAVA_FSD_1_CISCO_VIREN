package cisco.java.program.assignment;

public class Area {

	String shape;
	int side,height,breadth;
	double radius;
	Area(String s,int a){
		shape=s;
		side =a;
	}
	Area (String s,int h,int b){
	height =h;
	breadth =b;
	shape=s;
	}
	Area (String s,double r){
		radius =r;
		shape=s;
		}
	
     void squaredisplay(){
    	System.out.println("The area of "+ shape +" is : "+(side*side));
    }
    void rectanglediaplay(){
    	System.out.println("The area of "+shape+" is : "+(height*breadth));
    }
    void circlediaplay(){
    	System.out.println("The area of "+shape+" is : "+(3.14*radius*radius));
    }
    static int area(int b1,int h1){
    	return (int) (0.5*b1*h1);
    }
  	static  double area(double d1,double p1){
    	return (double) (0.5*d1*p1);
    }
     
	public static void main(String[] args) { 
		Area a1= new Area("Square",5);
		Area a2= new Area("Rectangle",67,9);
		Area a3= new Area("Circle",100.56);
		a1.squaredisplay();
		a2.rectanglediaplay();
		a3.circlediaplay();
		System.out.println("The area of Triangle is : "+Area.area(11,11));
		System.out.println("The area of Rhombus is : "+Area.area(12.3,12.6));  
	}

}
