package sec5;
import java.util.*;
public class eight 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		switch(c)
		{
		case('R'):
			System.out.println("Red");
		break;
		case('G'):
			System.out.println("Green");
		break;
		case('B'):
			System.out.println("Blue");
		break;
		case('O'):
			System.out.println("Orange");
		break;
		case('Y'):
			System.out.println("Yellow");
		break;
		case('W'):
			System.out.println("Whte");
		break;
		default:
			System.out.println("Invalid Code");
		}
		sc.close();
	}
}
