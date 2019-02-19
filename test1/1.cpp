#include<bits/stdc++.h>
using namespace std;

int main()
{
	int N;
	cout<<"Enter N:"<<endl;
	cin>>N;
	int arr[N][N];
	int i,j;
	for(i=0;i<N;i++)
		for(j=0;j<N;j++)
			arr[i][j]=0;
	int x = N/2;
	int y = N-1;
	int num=1;
	while(num<=N*N)
	{
		if(x==-1 && y==N)
		{
			x = 0;
			y = N-2;
		}
		else
		{
			if(y == N)
				y = 0;
			if(x < 0)
				x = N-1;
		}
		if(arr[x][y])
		{
			y = y-2;			
			x++;
			continue;
		}
		else
		{
			arr[x][y] = num;
			num++;
		}
		x--;
		y++;
	}
	
	// print
	for(int i=0; i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			printf("%d ",arr[i][j]);
		}
		printf("\n");
	}
	
	// validate
	int f=1;
	int s=0,s1=0;
	for(i=0;i<N;i++)
	{
		// row, col
		s=0;s1=0;
		for(j=0;j<N;j++)
		{
			s+=arr[i][j];
			s1+=arr[j][i];
		}
		if(s1!=(N*(N+1))/2 || s!=(N*(N+1))/2)
		{
			f= 0;
		}
	}
	// diag
	s=0;s1=0;
	for(i=0;i<N;i++)
	{
		s+=arr[i][i];
		s1+=arr[i][N-1-i];
	}
	if(s1!=(N*(N*N+1))/2 || s!=(N*(N*N+1))/2)
	{
		f= 0;
	}
	if(f==0)
		printf("Magic square valid.\n");
	else
		printf("Magic square invalid.\n");
	return 0;
}
