#include<bits/stdc++.h>
using namespace std;
class Bank
{
	int balance;
	public:
	int deposit(int amount, int balance)
	{
		this->balance = amount + balance;
		return this->balance;
	}
	int withdraw(int amount, int balance)
	{
		if(amount >= balance)
		{
			printf("Amount greater than balance, Can not withdraw.\n");
			return 0;
		}
		this->balance = balance - amount;
		return this->balance;
	}
};

int main()
{
	Bank b1;
	int bal, amt;
	amt = 100;
	bal = 500;
	printf("New Balance: %d\n", b1.deposit(amt, bal));
	int x = b1.withdraw(amt, bal);
	if(x!=0)
		printf("New balance: %d\n", x);
	return 0;
}
