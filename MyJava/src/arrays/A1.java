package arrays;
import java.util.*;
public class A1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int s=0;
		float av=0;
		for(int i=0;i<n;i++)
		{
			s=s+a[i];
		}
		av=s/n;
		System.out.println("Sum is"+s+"Avg is"+av);
		sc.close();
	}
}
