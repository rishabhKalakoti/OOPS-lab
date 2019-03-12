#include<bits/stdc++.h>
#include<pthread.h>
#include<mutex>
#include <unistd.h>
#include <stdlib.h>
//g++ -std=c++11 2.cpp -lpthread

using namespace std;
int balance=600;
mutex m;
void * father(void *args)
{
	while(1)
	{
		m.lock();
		while(balance<=2000)
		{
			int x=rand()%200+1;
			balance+=x;
			cout<<"Amount deposited by father :"<<x<<"\n";
			cout<<"New balance :"<<balance<<"\n";
		}
		m.unlock();
		sleep(1);
	}
		
}
void *son(void *args)
{

	while(1)
	{
		m.lock();
		while(balance>=500)
		{
			int x=rand()%150+1;
			balance-=x;
			cout<<"Amount withdraw by son :"<<x<<"\n";
			cout<<"New balance :"<<balance<<"\n";
		}
		m.unlock();
		sleep(1);	
	}
}

int main()
{
	pthread_t f,s;
	pthread_create(&f,NULL,&father,NULL);
	pthread_create(&s,NULL,&son,NULL);

	pthread_join(f,NULL);
	pthread_join(s,NULL);
	return 0;
}
