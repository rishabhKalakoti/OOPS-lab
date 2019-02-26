import java.util.*;

class RangeException extends Exception
{
	public String toString()
	{
		return "Not in range 0-1";
	}
}

class ArgAddition
{
	public static void add(String[] params)
	{
		try {
			double sum = 0.0;
			for(int i=0;i<params.length;i++)
			{
            	double x = Double.parseDouble(params[i]);
            	if(x<0.0 || x>1.0)
            	{
            		throw new RangeException();
            	}
            	sum += x;
            }
            System.out.println("Sum: " + sum);
        }
        catch (RangeException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println("Incorrect format for the number.");
        }
        finally
        {
        	System.out.println("Thank you for using the program.");
        }
	}
	public static void main(String []args)
	{
		System.out.println("Enter N:");
		Scanner scan = new Scanner(System.in);
    	int N = Integer.parseInt(scan.nextLine());
    	System.out.println("Enter the numbers one by one.");
    	
    	String[] params = new String[N];
    	for(int i=0;i<N;i++)
    	{
    		String num = scan.nextLine();
			params[i] = num;    	
    	}
    	add(params);
	}
}
