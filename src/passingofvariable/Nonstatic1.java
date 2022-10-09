package passingofvariable;


public class Nonstatic1 
{
	public void mul(int V,int W)
	{
	
		int Q=V*W;
		
		System.out.println("Multiplication of V & W;"+Q);
		
		
		
	}

	public static void main(String []args)
	{
		Nonstatic1 M1=new Nonstatic1();
		M1.mul(25,96);
		Nonstatic2 D1=new Nonstatic2();
		D1.div(189,22);
	
		
	}

}
