import java.util.Scanner;
class notHexException extends Exception{
	int a;
	notHexException(int b)
	{
		a=b;
	}
	notHexException()
	{
		a=0;
	}
	public String toString()
	{
		return "NotHexException: " + a + "\nString is not a hexadecimal number.";
	}
}

class Hexadecimal{
	public static void main(String []args)
	{
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		try
		{
			for(int i=0; i<in.length(); i++)
			{
				char c = in.charAt(i);
				if(!((c<='9' && c>='0') || (c<='E' && c>='A') || (c<='e' && c>='a')))
					throw new notHexException(1);
			}
			System.out.println("String is a hexadecimal number.");
		}
		catch(notHexException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Input: " + in);
		}
	}
}
