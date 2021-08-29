package cisco.java.program.assignment;
import java.util.*;


public class StringEx {

	public static void main(String[] args) {
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y= new String ("Mumbai");
		String l=new String ("delhi");
		String p=new String("Hello");
		
		if(o.equals(l)){
			System.out.println("true o equals l");
		}
		else{
			System.out.println("False o not equals l");
		}
		if(y.equals(p)){
			System.out.println("true y equals p");
		}
		else{
			System.out.println("False y not equals p");
		}
		if(t.equals(o)){
			System.out.println("true t equals o");
		}
		else{
			System.out.println("False t notequals o");
		}
		if(k.equals(y)){
			System.out.println("true k equals y");
		}
		else{
			System.out.println("False k notequals y");
		}
		if(p.equals(y)){
			System.out.println("true p equals y");
		}
		else{
			System.out.println("False p notequals y");
		}
		if(o==l){
			System.out.println("true o equals l");
		}
		else{
			System.out.println("False o not equals l");
		}
		if(y==p){
			System.out.println("true y equals p");
		}
		else{
			System.out.println("False y not equals p");
		}
		if(t==o){
			System.out.println("true t equals o");
		}
		else{
			System.out.println("False t notequals o");
		}
		if(k==y){
			System.out.println("true k equals y");
		}
		else{
			System.out.println("False k notequals y");
		}
		if(p==y){
			System.out.println("true p equals y");
		}
		else{
			System.out.println("False p notequals y");
		}

	}

}
