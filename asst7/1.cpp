#include<bits/stdc++.h>
using namespace std;

int gcd(int a, int b)
{
	if(a==0)
		return b;
	return gcd(b%a,a);
}

class Fraction
{
	public:
	int num;
	int den;
	Fraction()
	{
		this->num=1;
		this->den=1;
	}
	Fraction simplify()
	{
		if((this->den) < 0)
		{
			this->den *=(-1);
			this->num *=(-1);
		}
		int g = gcd(abs(this->num),abs(this->den));
		return Fraction(this->num/g,this->den/g);
	}
	Fraction(int num, int den)
	{
		this->num=num;
		this->den=den;
	}
	int operator==(Fraction &f)
	{
		if(f.num == this->num && f.den == this->den)
			return 1;
		return 0;
	}
	Fraction operator+(Fraction &f)
	{
		return Fraction(this->num * f.den + this->den * f.num, this->den * f.den).simplify();
	}
	Fraction operator-(Fraction &f)
	{		
		return Fraction(this->num * f.den - this->den * f.num, this->den * f.den).simplify();
	}
	Fraction operator*(Fraction &f)
	{
		return Fraction(this->num * f.num, this->den * f.den).simplify();
	}
	Fraction operator/(Fraction &f)
	{
		return Fraction(this->num*f.den,this->den*f.num).simplify();
	}
	int operator>(Fraction &f)
	{
		return this->num * f.den > this->den * f.num;
	}
	int operator<(Fraction &f)
	{
		return this->num * f.den < this->den * f.num;
	}
	friend ostream & operator << (ostream &out, const Fraction &f); 
}; 
  
ostream & operator << (ostream &out, const Fraction &f) 
{
    out << f.num << "/" << f.den; 
    return out; 
} 

int main()
{
	Fraction f1 = Fraction(3,8);
	Fraction f2 = Fraction(5,8);
	cout << (f1==f2) << endl;
	cout << (f1+f2) << endl;
	cout << (f1-f2) << endl;
	cout << (f1*f2) << endl;
	cout << (f1/f2) << endl;
	cout << (f1>f2) << endl;
	cout << (f1<f2) << endl;
	return 0;
}
