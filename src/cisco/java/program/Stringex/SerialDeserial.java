package cisco.java.program.Stringex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerialDeserial {
	

	public static void main(String[] args)  throws IOException
	{
		Student obj=new Student (101,25,"thish","kajanina",6);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try{
			fos= new FileOutputStream("D://mine/hai.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("serialzation done");
			
		}
		catch (IOException ioe){
			
			System.out.println(ioe);
		}
		finally{
			oos.close();
			fos.close();
		}
		Student o=null;
		try{
		FileInputStream fis= new FileInputStream("D://mine/hai.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o=(Student)ois.readObject();
			ois.close();
			fis.close();
			
		}
		catch (IOException ioe){
			ioe.printStackTrace();
			return;
		}
		catch(ClassNotFoundException cnfe){
			System.out.println("Student class is not found");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Student Name:"+o.getStuName());
		System.out.println("Student Age:"+o.getStuAge());
		System.out.println("Student Rollno:"+o.getStuRollNum());
		System.out.println("Student Address:"+o.getStuAddress());
		System.out.println("Student Height:"+o.getStuHeight());
		

	}
}

//.........................................STUDENT..............................................//
class Student implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int stuRollNum;
private int stuAge;
private String stuName;
private String stuAddress;
private int stuHeight;

public  Student (int roll,int age,String name,String address,int height){
	this.stuRollNum=roll;
	this.stuAge=age;
	this.stuAddress=address;
	this.stuName=name;
	this.stuHeight=height;
	
	
}

public int getStuRollNum() {
	return stuRollNum;
}

public void setStuRollNum(int stuRollNum) {
	this.stuRollNum = stuRollNum;
}

public int getStuAge() {
	return stuAge;
}

public void setStuAge(int stuAge) {
	this.stuAge = stuAge;
}

public String getStuName() {
	return stuName;
}

public void setStuName(String stuName) {
	this.stuName = stuName;
}

public String getStuAddress() {
	return stuAddress;
}

public void setStuAddress(String stuAddress) {
	this.stuAddress = stuAddress;
}

public int getStuHeight() {
	return stuHeight;
}

public void setStuHeight(int stuHeight) {
	this.stuHeight = stuHeight;
}
}



