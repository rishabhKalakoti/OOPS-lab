import java.io.*;
import java.util.Random;
class party
{
	public static void main(String[] args)
	{
		int simulations;
		simulations=1000;
		if(args.length != 1)
		{
			System.out.println("Invalid number of arguments");
			System.exit(-1);
		}
		int N = Integer.parseInt(args[0]);
		Random rand = new Random();
		//System.out.println(N);
		int success = 0;
		for(int count =0;count<simulations;count++)
		{
			//System.out.println("Simulation " + (count+1));
			int[] arr = new int[N];
			int[] flag = new int[N];
			for(int i=0;i<N;i++)
			{
				flag[i]=0;
				arr[i]=-1;
			}
			for(int i=0;i<N;i++)
			{
				int r;
				while(true)
				{
					r = rand.nextInt(N);
					if(flag[r]==0)
					{
						flag[r]=1;
						arr[i] = r;
						break;
					}
				}
			}
			int c=0;
			for(int i=0;i<N;i++)
			{
				if(arr[i]==i)
					c++;
			}
			if(c>0)
				success++;
		}
		System.out.println("For "+(simulations)+" simulations, the success rate is "+(double)(success*1.0/simulations));
		System.out.println("As N increases, the fraction tries to reach a number between 0 and 1. Around 6.3 to 6.4");
	}
}
