package arrays;
import java.util.*;
public class A8 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] n = new int[a];
		int sum = 0,d=0;    
		for(int i=0;i<n.length-1;i++)
		{
		    if(n[i]==6)
		    {
		        for(int j=n.length-1;j>=0;j--)
		        {
		            if(n[j]==7)
		            break;
		            d=d+n[j];
		        }
		        break;
		    }
		    sum=sum+n[i];
		}
		System.out.println(d+sum); 
		sc.close();
	}
}
