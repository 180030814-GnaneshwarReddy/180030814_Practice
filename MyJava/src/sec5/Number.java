package sec5;
import java.util.*;
public class Number {
	public static void main(String []args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println(n+"is Positive Number");
		}
		else if(n<0)
		{
			System.out.println(n+"is Negative Number");
		}
		else
			System.out.println("It s Zero");
		sc.close();
	}
}
