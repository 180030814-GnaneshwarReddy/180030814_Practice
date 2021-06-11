package classandobj;
import java.util.*;
class calci
{

	static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
   static double powerDouble(double num1,double num2)
   {
    return Math.pow(num1,num2);
    }
}
public class ClassObj2 
{
	public static void main(String[] args) 
	{
		int x,y;
		double p,q;
		System.out.println("enter two integer values");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("enter two double values");
		p=in.nextDouble();
		q=in.nextDouble();
		System.out.println(calci.powerDouble(p,q));
	    System.out.println(calci.powerInt(x,y));
		in.close();

	}
}
