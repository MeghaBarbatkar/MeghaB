package generalization;

public class Airtel implements Gen1 
{

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("Call limit=2000");
	}

	@Override
	public void Internet() {
		// TODO Auto-generated method stub
		System.out.println("Data Limit= 1.5gb");
	}

	@Override
	public void SMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS=100");
	}
	public void wynk_music()
	{
		System.out.println("wynk_music is additional feature");
	}

}
