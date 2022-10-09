package controlstatements;
 // else if : if conditions are more & one false condition then use else if
public class Sample3 
{
     public static void main(String[] args)
     {
    	 
    	 int mark=75; // variable
    	 if (mark>=75) //condition
    	 {
    		 System.out.println("Distinction");
    	 }
    	 else if(mark>=60)
    	 {
    		 System.out.println("First Class");
    		 
    	 }
    	 else if(mark>=50)
    	 {
    		 System.out.println("Second Class");
    		
    	 }
    	 else if (mark>=35)
    	 {
    		 System.out.println("Pass");
    	
    	 }
    	 else
    	 {
    		 System.out.println("Fail");   // false statement
    	 }
	}

}
