class myInt
{
	Integer val;
	myInt(int i)
	{
		val = i;
	}
	public String toString()
	{
		int i = val.intValue();
		return i+"";
	}
}
class SyncThread extends Thread
{
	myInt s;
	Object l;
	public SyncThread(myInt sum, Object lock)
	{
		this.s = sum;
		l = lock;
	}
	public void run()
	{
		synchronized(l)
		{
			this.s.val+=1;
		}
	}
}
class AsyncThread extends Thread
{
	myInt s;
	AsyncThread(myInt sum)
	{
		this.s = sum;
	}
	public void run()
	{
		this.s.val += 1;
	}
	
}
class Launcher
{
	public static void main(String[] args)
	{
		myInt sum = new myInt(0);
		// Async
		AsyncThread[] async = new AsyncThread[1000];
		for(int i=0;i<1000;i++)
		{
			async[i] = new AsyncThread(sum);
			async[i].start();
		}
		for(int i=0;i<1000;i++)
		{
			try
			{
				async[i].join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Async: " + sum);
		// Sync
		sum = new myInt(0);
		Object lock = new Object();
		SyncThread[] sync = new SyncThread[1000];
		for(int i=0;i<1000;i++)
		{
			sync[i] = new SyncThread(sum, lock);
			sync[i].start();
		}
		for(int i=0;i<1000;i++)
		{
			try
			{
				sync[i].join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Sync: " + sum);
	}
}
