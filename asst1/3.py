class Student:
	def __init__(self):
		self._rollno=0
		self._name=""
		self._marks={0.0,0.0,0.0,0.0}
		self._grade=0.0
	def _calculate(self):
		self._grade=sum(self._marks)/len(self._marks)
	def readData(self,roll,name,marks):
		self._rollno=roll
		self._name=name
		self._marks=marks
		self._calculate()
	def displayData(self):
		print("Roll No: ", self._rollno)
		print("Name: ", self._name)
		print("Marks: ", self._marks)
		print("Grade: ", self._grade)
	def __lt__(self, other):
		return self._name < other._name
	def sortName(self, students):
		return sorted(students)
		
if __name__=="__main__":
	s=list()
	for i in range(5):
		s.append(Student())
	s[0].readData(1098,"Rishabh",{80.0,76.0,82.0,91.0})
	s[1].readData(1145,"Sankhya",{60.0,64.0,72.0,56.0})
	s[2].readData(1090,"Pulkit",{65.0,84.0,92.0,66.0})
	s[3].readData(1004,"Vandita",{95.0,94.0,92.0,96.0})
	s[4].readData(1008,"Nidheesh",{85.0,84.0,82.0,86.0})
	
	s=s[0].sortName(s)
	
	for i in range(5):
		s[i].displayData()
