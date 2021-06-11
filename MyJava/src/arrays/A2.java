package arrays;
import java.util.*;
public class A2 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		for(int x = 0;x < a;x++)
		{
			b[x]=sc.nextInt();
		}
		Arrays.sort(b);
		System.out.println("Min"+b[0]+"Max"+b[a-1]);
		sc.close();
	}
}
