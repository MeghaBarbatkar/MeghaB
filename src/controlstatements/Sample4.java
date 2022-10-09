package controlstatements;

// Nested if : if conditions are more and each condition have false statement


public class Sample4 
{
	public static void main(String[] args) 
	{
		String Un="abc";
	    String pass="xyz";
	    
	    if(Un=="abc")
	    {
	    	System.out.println("Username is correct");
	    if(pass=="xyz")
	    {
	    	System.out.println("Password is correct");
	    	System.out.println("Login Successful");
	    } // second if close
	    else
	    {
	    	System.out.println("Username is correct but Password is incorrect");
	    	
	    }
	    } // 1st if close
	    else 
	    {
	    	System.out.println("Username is incorrect");
	    }
	    
		
	}

}
