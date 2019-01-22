#include<bits/stdc++.h>
using namespace std;

// global variables
int correct=0;
int wrong=0;
int unanswered = 0;
enum status{Unanswered,Correct,Wrong};
string getTxt(enum status ch)
{
	switch(ch)
	{
		case Unanswered:
			return "Unanswered";
		case Correct:
			return "Correct";
		case Wrong:
			return "Wrong";
	}
}
class Question{
	public:
	int qNo;
	char answer;
	char correctAns;
	enum status s;
	void setStatus(){
		if(this->answer == 'X')
		{
			s = Unanswered;
			unanswered++;
		}
		else if(this->answer == this->correctAns)
		{
			s = Correct;
			correct++;
		}
		else
		{
			s= Wrong;
			wrong++;
		}
	}
	Question(int q, char ans, char crt)
	{
		this->qNo = q;
		this->answer = ans;
		this->correctAns = crt;
		this->setStatus();
	}
	void printData(){
		cout<<this->qNo<<"\t\t"<<this->answer<<"\t\t"<<this->correctAns<<"\t\t"<< getTxt(this->s)<<endl;
	}
};

int main(int argc, char** argv){
	int i;
	char answers[] = {'C','A','B','D','B','C','C','A'};
	if(argc!=9)
	{
		printf("Please give the 8 answers as argumnets.\n");
		exit(-1);
	}
	vector<Question>q;
	printf("Question\tSubmitted Ans\tCorrect Ans\tResult\n");
	for(i=0;i<8;i++)
	{
		q.push_back(Question(i+1,*argv[i+1],answers[i]));
		q[i].printData();
	}
	printf("No of correct answers: %d\n",correct);	
	printf("No of wrong answers: %d\n",wrong);	
	printf("No of unattempted answers: %d\n",unanswered);
	if(correct >=5)
		printf("The candidate passed.\n");
	else
		printf("The candidate did not pass.\n");	
	return 0;
}
