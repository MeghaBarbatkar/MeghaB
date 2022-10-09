package inheritance;

public class Test 
{
	public static void main(String[]args)
	{
		// in this we create object of child class and acquire properties of parent class but if we create object of parent class then we cannot aquire properties because parent cannot aquire subclass this concept is called inheitance
		Bmw B1=new Bmw();  
		
		B1.start();// Overriding
		B1.stop();
	    B1.refuel();
	    System.out.println("---------------");
	    
	    Car C1=new Car();
	    C1.start();
	    C1.refuel();
	    C1.stop();
	    
	    System.out.println("---------------");
	    
	    Car C2=new Bmw();// Upcasting // In this we create object of parent class with reference to child but we cant aquire properties of child this called upCATING
	    
	    C2.start();
	    C2.stop();
	    
	    
	    
	
	}
	
	

}
