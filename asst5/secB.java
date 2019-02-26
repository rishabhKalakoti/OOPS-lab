/*
Problem Statement:
Rumors. Alice is throwing a party with N other guests, including Bob. Bob starts a rumor about
Alice by telling it to one of the other guests. A person hearing this rumor for the first time will
immediately tell it to one other guest, chosen at random from all the people at the party except Alice
and the person from whom they heard it. If a person (including Bob) hears the rumor for a second
time, he or she will not propagate it further. Write a program to estimate the probability that
everyone at the party (except Alice) will hear the rumor before it stops propagating. Also calculate
an estimate of the expected number of people to hear the rumor.(JAVA)
*/
import java.io.*;
import java.util.Random;

class Rumor
{
	public static int select(int N, int p)
	{
		Random rand = new Random();
		while(true)
		{
			int r = rand.nextInt(N);
			if(r!=p)
				return r;
		}
	}
	public static void main(String[] args)
	{
		int N=10000;
		int simulations=1000;
		int s=0;
		double x = 0.0;
		for(int count=0;count<simulations;count++)
		{
			int[] arr = new int[N];
			// bob = 0
			for(int i=0;i<0;i++)
			{
				arr[i]=0;
			}
			arr[0]=1;
			int ppl=1;
			int p=0;
			while(true)
			{
				int q = select(N,p);
				if(arr[q]==0)
				{
					ppl++;
					arr[q]=1;
				}
				else
				{
					break;
				}
			}
			x += ppl;
			int f=0;
			for(int i=0;i<N;i++)
			{
				if(arr[i]!=1)
					f=1;
			}
			if(f==0)
				s++;
		}
		System.out.println("Probability: " + (s*1.0)/(simulations*1.0));
		System.out.println("Expected number: " + x/(simulations*N));
	}
}
