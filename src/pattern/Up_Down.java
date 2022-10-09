package pattern;

public class Up_Down 
{
	public static void main(String[] args)
	{
	
		//2 for loop
		//1 row 1 column 
		//1 Star 1 next line 
		
		int Star=1;
		
		for (int i=1;i<=5;i++)                   //Row this loop is use to get cursor on next line
		{
			
			for(int j=1;j<=Star;j++)   //Column this loop is use to print the star
			{
				System.out.print("* ");        
			}
			System.out.println();
			Star++;
		}
		
		System.out.println(Star);
		
		
	}
	

	
}


