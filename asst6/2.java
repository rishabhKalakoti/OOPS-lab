import java.util.Random;
class Father extends Thread
{
	Random rand = new Random();
	Object Lock=null;
	Father(Object Lock)
	{
		this.Lock=Lock;
	}	
	public void run()
	{
		while(true)
		{
			try
			{
				deposit();	
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				;
			}
		}
	}
	public void deposit()
	{	
		synchronized(this.Lock)
		{
			this.Lock.notifyAll();
			try
			{
				this.Lock.wait();
				while(Account.balance <= 2000)
				{
					int r = rand.nextInt(200);
					Account.balance += r;
					System.out.println("Father deposited Rs " + r + ". New Balance is Rs " + Account.balance + ".");
				}
				this.Lock.notifyAll();
			}
			catch(InterruptedException e)
			{
				;
			}
			this.Lock.notifyAll();
		}
	}
}
class Son extends Thread
{
	Random rand = new Random();
	Object Lock = null;	
	Son(Object Lock)
	{
		this.Lock=Lock;
	}
	public void run()
	{
		while(true)
		{
			
			try
			{
				withdraw();	
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				;
			}
		}
	}
	public void withdraw()
	{
		synchronized(this.Lock)
		{	
			this.Lock.notifyAll();
			try
			{
				this.Lock.wait();
				while(Account.balance >= 500)
				{
					int r = rand.nextInt(150);
					Account.balance -= r;
					System.out.println("Son withdrawed Rs " + r + ". New Balance is Rs " + Account.balance + ".");
				}
				this.Lock.notifyAll();
			}
			catch(InterruptedException e)
			{
				;
			}
			this.Lock.notifyAll();
		}
		
	}
}
class Bank
{
	public static void main(String[] args)
	{	
		Object Lock = new Object();
		//public int balance = 600;
		Father f = new Father(Lock);
		Son s = new Son(Lock);
		f.start();
		s.start();
	}
}
