package classandobj;
import java.util.*;
class Patient
{
	String pname;
	double pht;
	double pwt;
	Patient(String pname, double pht,double pwt )
	{
		this.pname=pname;
		this.pht=pht;
		this.pwt=pwt;
	}
	double computeBMI()
	{
		double bmi=pwt/(pht*pht);
		return bmi;
	}
}
public class ClassObj3 
{
	public static void main(String[] args) 
	{
		String name;
		double ht,wt;
		System.out.println("Enter patient name, weight, height");
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		ht=in.nextDouble();
		wt=in.nextDouble();
		in.close();
		Patient obj=new Patient(name,ht,wt);
		System.out.println(obj.computeBMI());
		
		
		

	}
}
