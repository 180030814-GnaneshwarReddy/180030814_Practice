package sec5;
import java.util.*;
public class Sx {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String s = sc.next();
		if((age >= 1 && age <= 58)&& s.equals("Female"))
		{
			System.out.println("percentage of interest is 8.2%.");
		}
		else if((age >= 59 && age <= 100)&& s.equals("Female"))
		{
			System.out.println("percentage of interest is 9.2%.");
		}
		else if((age >= 1 && age <= 58)&& s.equals("Male"))
		{
			System.out.println("percentage of interest is 8.4%.");
		}
		else if((age >= 59 && age <= 100)&& s.equals("Male"))
		{
			System.out.println("percentage of interest is 10.5%.");
		}
	sc.close();
	}
}
