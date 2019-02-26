class NestException{
	public static void d()
	{
		try
		{
			System.out.println("d() starts.");				
			int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
			for(int i=0;i<15;i++)
			{
				System.out.println("Value at index " + i + " is " + intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured.");
			throw new ArrayIndexOutOfBoundsException();
		}
		finally
		{
			System.out.println("d() ends.");
		}
	}
	public static void c()
	{
		try
		{
			System.out.println("c() starts.");
			d();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured.");
			throw new ArrayIndexOutOfBoundsException();
		}
		finally
		{
			System.out.println("c() ends.");
		}
	}
	public static void b()
	{
		try
		{
			System.out.println("b() starts.");
			c();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured.");
			throw new ArrayIndexOutOfBoundsException();
		}
		finally
		{
			System.out.println("b() ends.");
		}
	}
	public static void a()
	{
		try
		{
			System.out.println("a() starts.");
			b();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured.");
			throw new ArrayIndexOutOfBoundsException();
		}
		finally
		{
			System.out.println("a() ends.");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			System.out.println("main starts.");
			a();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured.");
		}
		finally
		{
			System.out.println("main ends.");
		}
		
	}
}
