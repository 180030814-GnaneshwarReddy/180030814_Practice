package exphandle;
import java.util.InputMismatchException;
public class Exp3 
{
	public static void main(String[] args) 
	{
		int n=args.length;
		try
		{
			int i,sum=0;
			float avg=0;
			int b[]=new int[n];
			for(i=0;i<n;i++)
			{
				b[i]=Integer.parseInt(args[i]);
				sum=sum+b[i];
				avg=sum/(float)n;
				
			}
			System.out.println("Sum is:"+sum);
			System.out.println("Average is:"+avg);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e2)
		{
			System.out.println(e2);
		}
		catch(InputMismatchException e1)
		{
			System.out.println(e1);
		}

	}
}
