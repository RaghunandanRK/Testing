package demo;

public class FinallyBlock 
{
	public static void number(int n)
	{
		try
		{
			int res=1000/n;
			System.out.println(res);
		}
		catch(Exception a)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("Finally");
			
		}
	}
public static void main(String[] args) 
{
	number(5);
	number(0);
	number(1);
}
}
