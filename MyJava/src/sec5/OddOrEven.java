package sec5;
import java.util.*;
public class OddOrEven {
	public static void main(String []args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n%2==0)
			System.out.println(n+"is Even");
		else
			System.out.println(n+"is odd");
		sc.close();
	}
}
