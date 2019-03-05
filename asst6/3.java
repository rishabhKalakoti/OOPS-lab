class Odd extends Thread
{
	Object lock = null;
	Odd(Object l)
	{
		this.lock = l;
	}
	public void run()
	{
		try
		{
			synchronized(lock)
			{
				for(int i=1;i<=1000;i++)
				{
					if(i%2==1)
					{
						System.out.println(i);
						lock.notify();
						lock.wait();
					}		
				}
				lock.notify();
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class Even extends Thread
{
	Object lock = null;
	Even(Object l)
	{
		this.lock = l;
	}
	public void run()
	{
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();	
		}
		try
		{
			synchronized(lock)
			{
				for(int i=1;i<=1000;i++)
				{
					if(i%2==0)
					{
						System.out.println(i);
						lock.notify();
						lock.wait();
					}		
				}
				lock.notify();
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class Sequence
{
	public static void main(String[] args)
	{
		Object lock = new Object();
		Even even = new Even(lock);
		Odd odd = new Odd(lock);	
		odd.start();
		even.start();
	}
}
