package AssignmentLesson3;

class Main extends Exception 
{ 
    public Main(String s) 
    { 
        super(s); 
    } 
 

    public static void main(String args[]) 
    { 
        try
        { 
            throw new Main("temp"); 
        } 
        catch (Main ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
