package arrays;
import java.util.*;
public class A4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int arr[]= {65,67,69,70,71};
		int a=arr.length;
		char ch;
		for(int i=0;i<a;i++)
		{
			int x=arr[i];
			ch=(char)x;
			System.out.println(x+"  "+ch);
		}
		sc.close();
	}

}
