import java.io.*;
import java.util.*;

class PerfectString
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int l = s.length();
		Set<Character> theSet = new HashSet<Character>(); 
		for(int i=0;i<l;i++)
		{
			theSet.add(s.charAt(i));
		}
		if(l == theSet.size())
			System.out.println("The string is a perfect string.");
		else
			System.out.println("The string is not a perfect string.");
	}
}
