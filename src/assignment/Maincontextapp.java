package assignment;
	import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
import java.util.Scanner;


		//main context of application

public class Maincontextapp {
		public static void main(String[] args) {
			
			 Scanner option = new Scanner(System.in);
			 Application  obj=new  Application ();   //create a object for application class
				System.out.println(obj);;
				System.out.println("Main context");
				System.out.println("enter your choice");
				
		        int op;
				do{
					
		            System.out.println("1.display all the files in ascending order");
		            System.out.println("2.Display the Application Features");
		            System.out.println("3.Close the application");
		            
		            op =option.nextInt();
		           
		            if(op==1)
					 {
		            	obj.ascendingFile();
						 
					 }
					 
					 if(op==2)
					 {
						obj.moreOptions();
						 
					 }
			  
				  }while(op!=3);
				
			}
		}
	