package classandobj;
import java.util.*;
class Box
{
	int w;
	int h;
	int d;
	Box(int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
	}
	int volume(int w,int h,int d)
	{
		return w*h*d;
	}
	
}
public class ClassObj1 
{
	public static void main(String[] args) 
	{
		int w,h,d;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter w,h,d values of the box");
		w=in.nextInt();
		h=in.nextInt();
		d=in.nextInt();
		Box b=new Box(w,h,d);
	    System.out.println("Volume of the box is: "+b.volume(w, h, d));
	    in.close();
	}
}
