package passingofvariable;


public class Static1  
{
	public static void plus(int X,int Y,int Z)
	{
	
		int V=X+Y+Z;
		
		System.out.println("Addition of X,Y,Z;"+V);
		
	}
	
	public static void main(String []args)
	{
		plus(10,40,90);
		Static2.sub(50,40);
		
	
	}

}



