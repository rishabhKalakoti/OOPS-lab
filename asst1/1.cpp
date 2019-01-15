#include<bits/stdc++.h>
using namespace std;

class Data{
	private:
		int day;
		int month;
		int year;
	public:
		Data(){
			this->day=12;
			this->month=3;
			this->year=1993;
		}
		Data(int day, int month=10, int year=2000){
			this->day=day;
			this->month=month;
			this->year=year;
		}
		Data(Data &d){
			this->day=d.day;
			this->month=d.month;
			this->year=d.year;
		}
		~Data()
		{
			cout<<"deleted."<<endl;
		}
		void print(){
			cout<<(this->day)<<"/"<<(this->month)<<"/"<<(this->year)<<endl;
		}
};

int main(){
	Data date1(10,6);
	date1.print();
	Data date2;
	date2.print();
	Data date3 = date1;
	date3.print();
	return 0;
}
