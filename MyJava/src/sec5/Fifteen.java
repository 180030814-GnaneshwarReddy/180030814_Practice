package sec5;
import java.util.*;
public class Fifteen 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n>0)
		{
			int a;
			a = n%10;
			sum = sum + a;
			n = n/10;
		}
		System.out.println(sum);
		sc.close();
	}
}
