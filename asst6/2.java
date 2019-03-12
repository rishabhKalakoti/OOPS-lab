import java.util.Random;
class Father extends Thread
{
	Random rand = new Random();
	public void run()
	{
		while(true)
		{
			deposit();
		}
	}
	public synchronized void deposit()
	{
		while(Account.balance <= 2000)
		{
			int r = rand.nextInt(200);
			Account.balance += r;
			System.out.println("Father deposited Rs " + r + ". New Balance is Rs " + Account.balance + ".");
		}
	}
}
class Son extends Thread
{
	Random rand = new Random();
	public void run()
	{
		while(true)
		{
			withdraw();	
		}
	}
	public synchronized void withdraw()
	{
		
		while(Account.balance >= 500)
		{
			int r = rand.nextInt(150);
			Account.balance -= r;
			System.out.println("Son withdrawed Rs " + r + ". New Balance is Rs " + Account.balance + ".");
		}
	}
}
class Bank
{
	public static void main(String[] args)
	{
		//public int balance = 600;
		Father f = new Father();
		Son s = new Son();
		f.start();
		s.start();
	}
}
