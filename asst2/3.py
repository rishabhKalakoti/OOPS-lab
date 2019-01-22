class Player:
	def __init__(self,name):
		self.name = name
		self.runs = list()
		self.avg=0.0
		self.total=0
	def addRuns(self, a,b,c,d):
		self.runs=[a,b,c,d]
		self.calcTotal()
		self.calcAvg()
	def calcTotal(self):
		self.total = sum(self.runs)
	def calcAvg(self):
		self.avg = self.total/len(self.runs)
	def __lt__(self, other):
		return self.total<other.total

if __name__ == "__main__":
	team = list()
	team.append(Player("Dhoni "))
	team[0].addRuns(45,130,10,75)
	team.append(Player("Sachin"))
	team[1].addRuns(75,170,60,55)
	team.append(Player("Dravid"))
	team[2].addRuns(51,45,70,90)
	team.append(Player("Yuvraj"))
	team[3].addRuns(40,70,65,40)
	team.append(Player("Ganguly"))
	team[4].addRuns(35,90,55,120)
	
	
	for i in team:
		print(i.name," \tTotal runs: ", i.total,"\t Average runs: ", i.avg, sep=" ")
	print('')
	print("Maximum Total: ", max(team).name)
