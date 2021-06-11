package arrays;
import java.util.*;
public class A5 
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
		Arrays.sort(a);
		System.out.println("1st two Min"+a[0]+" "+a[1]);
		System.out.println(" two Max"+a[n-1]+" "+a[n-2]);
		sc.close();
	}
}
