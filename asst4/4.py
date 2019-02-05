import  functools
def comperator(a,b):
	print(a,b)
	if a[1]==b[1]:
		return a[0]<b[0]
	return a[1]>b[1]
if __name__ == "__main__":
	print("Enter the number")
	num = str(input())
	de = dict()
	for i in range(len(num)):
		if int(num[i]) in de.keys():
			de[int(num[i])]+=1
		else:
			de[int(num[i])]=1
	l = list()
	for a,b in de.items():
		l.append([a,b])
	l = sorted(l, key=functools.cmp_to_key(comperator))
	print(l)
	print(l[0][0],":",l[0][1])
