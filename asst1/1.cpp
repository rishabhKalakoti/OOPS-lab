#include<bits/stdc++.h>
using namespace std;

#define ii pair<float,float>
#define ff first
#define ss second

struct c{
	float first;	// real
	float second;	// imaginary
};

int main()
{
	typedef struct c complex;
	// real,  imaginary
	//typedef ii complex;
	complex a,b;
	// input
	cout<<"Input read and imaginary part of first complex no: (a + ib)"<<endl;
	cin>> a.ff >> a.ss;
	cout<<"Input read and imaginary part of second complex no: (c + id)"<<endl;
	cin>> b.ff >> b.ss;

	cout<<"Addition: (a+c)+(b+d)i"<<endl;
	cout<<"\t"<< a.ff+b.ff <<" + ("<< a.ss+b.ss <<")i"<<endl;
	cout<<"Subtraction: (a-c)+(b-d)i"<<endl;
	cout<<"\t"<< a.ff-b.ff <<" + ("<< a.ss-b.ss <<")i"<<endl;
	cout<<"Multiplication: (ac-bd)+(ad+bc)i"<<endl;
	cout<<"\t"<< a.ff*b.ff-a.ss*b.ss <<" + ("<< a.ff*b.ss+a.ss*b.ff <<")i"<<endl;
	cout<<"Division: (ac+bd)/(c*c+d*d)+(bc-ad)/(c*c+d*d)i"<<endl;
	float m = b.ff*b.ff + b.ss*b.ss;
	cout<<"\t"<< (a.ff*b.ff+a.ss*b.ss)/m <<" + ("<< (a.ss*b.ff-a.ff*b.ss)/m <<")i"<<endl;
	
	return 0;
}