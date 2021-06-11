package sec5;

public class CmdLine {
	public static void main(String []args)
	{
		if(args.length > 0)
		{
			for(String val:args)
			{
				System.out.println(val);
			}
		}
		else
		{
			System.out.println("No values");
		}
	}

}
