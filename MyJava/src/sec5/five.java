package sec5;
import java.util.*;
public class five 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if((s >= 65 && s <= 90)||(s >= 97 && s<= 122))
		{
			System.out.println("Alphabet");
		}
		else if(s >= 45 && s <= 57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		sc.close();
	}
}
