if __name__=="__main__":
	 l = [0,0,0,0,0,0,0,0,0,0]
	 s = str(input())
	 for i in range(len(s)):
	 	l[int(s[i])] += 1
	 for i in range(10):
	 	if max(l) == l[i]:
	 		print("Most frequent number:", i)
	 		print("Frequency:", l[i])
	 		break
