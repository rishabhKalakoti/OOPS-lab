import java.io.*;
import java.util.Scanner;

class count{
	public static void main(String []args){
		int X[] = new int[52];
		int m=0;
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		//System.out.println(s);
		for(int i=0;i<52;i++) X[i]=0;
		for(int i=0;i<s.length();i++)
		{
			char x = s.charAt(i);
			if(x>='a' && x<='z')
				m=Math.max(++X[(int)x-(int)('a')],m);
			else if(x>='A' && x<='Z')
				m=Math.max(++X[(int)x-(int)('A')+26],m);
		}
		System.out.println(m);
		for(int i=0;i<52;i++)
			if(X[i]==m)
				if(i<26) System.out.println((char)(i+(int)('a')));
				else System.out.println((char)(i-26+(int)('A')));
	} 
}
