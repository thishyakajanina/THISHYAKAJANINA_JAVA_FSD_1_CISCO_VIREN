package assignment;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Application class

public class Application {
	//creating the file object for directory
	
	File Rootdirectory =new File("/D://Phase1");
	 String files[] = Rootdirectory.list();
	 List filList =
	            new ArrayList(Arrays.asList(files));

	@SuppressWarnings("deprecation")
	
	public  void main(String[] args) {
							
						Scanner scanf = new Scanner(System.in);
	}
	
	//for display the files ascending order
 public void ascendingFile(){	
		System.out.println("The current files name in the Root directory");
		
		 Collections.sort(filList);
			  
 			 if(filList.isEmpty())
            {
           	System.out.println("please add some files...."); 
           	System.out.println("Directory is empty....."); 
           	 
            }
 			 else
 			 {
 				System.out.println(filList); 
 			    	 
 			 }  
 }
		//For displaying Application Features
		
 	public  void moreOptions()
	{
		int choice;
		Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nApplication Features");
            System.out.println("1. Add a File");
            System.out.println("2. Delete a File");
            System.out.println("3. Search a File");
            System.out.println("4. Exit ");
            
           choice =scan.nextInt();
            
            if(choice==1){
					addNewfile();
					
				}
				if(choice==2)
				{
					deleteFile(); 
				}
				if(choice==3)
				{
					
					searchFile();
				}
			}while(choice!=4);
        
	}
 	
 	//Add a file
			public  void addNewfile()
			{
			
                System.out.println("Add a file");
                try{
                	
                	System.out.println("Enter the file filename :");
                	Scanner sc=new Scanner(System.in);
                	String name=sc.nextLine();
                	
                	//creating object for file
        			File file=new File("D://Phase1/"+name);
        			
        		if(file.createNewFile())
        		{
        			filList.add(name);
        			System.out.println("Newfile is Created!!!");
        		}
        		else{
        			if(file.exists())
        			{
        				System.out.println("File already Exists!!");
        				System.out.println("File path:"+file.getAbsolutePath());
        				System.out.println("File name:"+file.getName());
        				System.out.println("File class:"+file.getClass());
        				System.out.println("File Parent:"+file.getParent());
        				System.out.println("File length:"+file.length());
        			}
        			else
        			{
        				System.out.println("File doesnot exists");
        			}   
        		}
                }
        			catch (IOException e)
        			{
        				e.printStackTrace();
        			}
			}  
			
		//Delete a file
			public  void deleteFile()
			{
            	
            	try{
            		System.out.println("Enter the filename to delete :");
                	Scanner sc=new Scanner(System.in);
                	String name=sc.nextLine();
            		
        			Path file=FileSystems.getDefault().getPath("D://Phase1/"+name);
        			try {
        				
        	            Files.delete(file);
        	            System.out.println(name+" Successfully deleted");
        	            filList.remove(name);
        	            
        	        } catch (NoSuchFileException x) {
        	            System.err.format("%s: no such" + " file or directory%n", file);
        	        } 
        	    }
            	catch (IOException x) {
    	            System.err.println(x);
    	        
    			}  
			}
			
			//search a file
			
			public  void searchFile()
			{
            	
            	
            	System.out.println("Enter the filename to search :");
            	Scanner s=new Scanner(System.in);
            	String search=s.nextLine();
            	boolean found=false;
            		
            		for(int i=0;i<filList.size();i++){
            			
            			if(filList.get(i).equals(search)){
            				found=true;
            				
            				try {
        						FileInputStream fis=new FileInputStream("D://Phase1/"+search);
        						DataInputStream dis=new DataInputStream(fis);
        						System.out.println(filList.get(i)+" found");
        					} catch (FileNotFoundException e) {
        						
        						e.printStackTrace();
        					} catch (IOException e) {
        						e.printStackTrace();
        					}
            			}
            		}
            		if(found==false)
        			{
        				
        				System.out.println("file not found");
        			}
                                           
            }
        }
	