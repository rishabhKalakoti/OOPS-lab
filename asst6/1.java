import java.util.Scanner;
class Gen extends Thread
{	
	// find divisors
	Object lock = new Object();
	int num;
	int sum = 0;
	Gen(int n)
	{
		this.num = n;
	}
	public void run()
	{
		synchronized(this)
		{
			try
			{
				for(int i=1;i<num;i++)
				{
					if(num%i==0)
						sum+=i;
				}
				wait();
				Thread.sleep(100);
				notify();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	public int getSum()
	{
		synchronized(this)
		{
			try
			{
				notify();
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		return sum;
		
	}
}
class AmicableNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Gen csa = new Gen(a);
		Gen csb = new Gen(b);
		csa.start();
		csb.start();
		if(csa.getSum() == b && csb.getSum() == a)
		{
			System.out.println("Amicable numbers.");
		}
		else
		{
			System.out.println("Not amicable numbers.");
		}
	}
}
