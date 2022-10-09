package generalization;

public class Test_class 
{
	public static void main(String[] args) 
	{
		Idea o1=new Idea();
		Jio o2=new Jio();
		Airtel o3=new Airtel();
		
		o1.Call();
		o1.Internet();
		o1.SMS();
		o1.Hungama();
		System.out.println("----------------------");
		
		o2.Call();
		o2.Internet();
		o2.SMS();
		o2.Jio_savan();
		System.out.println("-----------------------");
		
		o3.Call();
		o3.Internet();
		o3.SMS();
		o3.wynk_music();
		
	}

}
