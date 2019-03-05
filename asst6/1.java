import java.util.Scanner;
class Gen extends Thread
{	
	// find divisors
	int num;
	int sum = 0;
	Gen(int n)
	{
		this.num = n;
	}
	public void run()
	{
		wait();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		notify();
	}
	public int getSum()
	{
		return sum;
	}
}
class AmicableNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner();
		int a = sc.nextInt();
		int b = sc.nextInt();
		gen csa = new gen(a);
		gen csb = new gen(b);
		csa.start();
		csb.start();
		
	}
}
