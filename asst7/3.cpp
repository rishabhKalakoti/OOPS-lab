#include<bits/stdc++.h>
#include<pthread.h>
using namespace std;
vector<double>d;
double sum[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
int num=0;
void* sum_array(void* arg) 
{ 
	int part = num++;
  	double s=0.0;
    // Each thread computes sum of 1/4th of array 
    int thread_part = part++; 
  
    for (int i = part * 100; i < (part+1)*100 && i<d.size(); i++) 
        s += d[i]; 
	sum[part]=s;
}
int main()
{
	srand(time(NULL));
	for(int i=0;i<1000;i++)
	{
		d.push_back((double)((rand()%100)*1.0/10));
		cout<<d[i]<<endl;
	}
    pthread_t threads[10]; 
  	
    // Creating 4 threads 
    for (int i = 0; i < 10; i++) 
        pthread_create(&threads[i], NULL, sum_array, (void*)NULL); 
  
    // joining 4 threads i.e. waiting for all 4 threads to complete 
    for (int i = 0; i < 10; i++) 
        pthread_join(threads[i], NULL); 
    
	double s=0.0;
    for(int i=0;i<10;i++)
    {
    	s+=sum[i];
    }
    cout<<"SUM: "<<s<<endl;
	
	return 0;
}
