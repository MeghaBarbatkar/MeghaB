package generalization;

public class Idea implements Gen1
{

	@Override
	public void Call() 
	{
		// TODO Auto-generated method stub
		System.out.println("Call Limit=1500 min");
	}

	@Override
	public void Internet() 
	{
		// TODO Auto-generated method stub
		System.out.println("Data limit=2gb");
	}

	@Override
	public void SMS() 
	{
		// TODO Auto-generated method stub
		System.out.println("SMS=300");
	}
	
	public void Hungama ()
	{
        System.out.println("Hungama is addition feature");
	}

}