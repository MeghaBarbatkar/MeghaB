package controlstatements;
//Nested if
public class Sample5 
{
	public static void main(String[] args) 
	{
		String Un="meghabarbatkar80@gmail.com";
		String Pass="megha@123";
		String DOB="16/05/1997";
		String Pin="12345";
		
		if(Un=="meghabarbatkar80@gmail.com")
		{
			System.out.println("Username is correct");
			if(Pass=="megha@123")
			{
				System.out.println("Password is correct");
				if(DOB=="16/05/1997")
				{
					System.out.println("DOB is correct");
					if(Pin=="12345")
					{
						System.out.println("Pin is incorrect");
					}
					else
					{
						System.out.println("Pin is incorrect");
					}
				}
				else
				{
					System.out.println("DOB is incorrect");
				}
			}
			else
			{
				System.out.println("Password is incorrect");
			}
			
		}
		else
		{
			System.out.println("Username is incorrect");
		}
				
		
		
	}

}
