package generalization;

public class Jio implements Gen1
{

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("Call Limit=Unlimited");
	}

	@Override
	public void Internet() {
		// TODO Auto-generated method stub
		System.out.println("Data Limit=4gb");
	}

	@Override
	public void SMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS=300");
	}
	public void Jio_savan()
	{
		System.out.println("Jio_savan is additional feature");
	}

}
