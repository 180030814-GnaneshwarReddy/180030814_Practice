package sec5;
public class Twelve 
{
	public static void main(String []args)
	{
		int n = 12;
		int i,p=0;
		for(i=2;i<=n/2;i++)
		{
			p = n%i;
			if(p==0)
			{
				break;
			}
		}
		if(p==0||n==1)
		{
			System.out.println("It is not a prime number");
		}
		else
		{
			System.out.println("It is a prime number");
		}
	}
}
