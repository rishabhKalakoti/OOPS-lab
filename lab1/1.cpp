#include<iostream>
using namespace std;



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
	cout<<"Input real and imaginary part of first complex no: (a + ib)"<<endl;
	cin>> a.first >> a.second;
	cout<<"Input real and imaginary part of second complex no: (c + id)"<<endl;
	cin>> b.first >> b.second;

	cout<<"Addition: (a+c)+(b+d)i"<<endl;
	cout<<"\t"<< a.first+b.first <<" + ("<< a.second+b.second <<")i"<<endl;
	cout<<"Subtraction: (a-c)+(b-d)i"<<endl;
	cout<<"\t"<< a.first-b.first <<" + ("<< a.second-b.second <<")i"<<endl;
	cout<<"Multiplication: (ac-bd)+(ad+bc)i"<<endl;
	cout<<"\t"<< a.first*b.first-a.second*b.second <<" + ("<< a.first*b.second+a.second*b.first <<")i"<<endl;
	cout<<"Division: (ac+bd)/(c*c+d*d)+(bc-ad)/(c*c+d*d)i"<<endl;
	float m = b.first*b.first + b.second*b.second;
	cout<<"\t"<< (a.first*b.first+a.second*b.second)/m <<" + ("<< (a.second*b.first-a.first*b.second)/m <<")i"<<endl;
	
	return 0;
}