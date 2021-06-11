package arrays;
import java.util.*;
public class A7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.arraycopy(a,0,b,0,a.length);
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]);
		}
		sc.close();
	}
}
