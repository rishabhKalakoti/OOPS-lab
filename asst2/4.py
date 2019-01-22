def getPriority(x):
	if x=='+' or x=='-':
		return 1
	elif x=='*' or x=='/':
		return 2
def evalx(n2,op,n1):
	n1=float(n1)
	n2=float(n2)
	if op=='+':
		return n2+n1
	if op=='-':
		return n2-n1
	if op=='*':
		return n2*n1
	if op=='/':
		if n1==0:
			print("Division by zero. Termination.")
			exit()
		return n2/n1
	print("Incorrect operator.")
	exit()
	
def solve(exp):
	print(exp)
	valStack = list()
	opStack = list()
	for token in exp:
		if token.isnumeric()==True:
			valStack.append(float(token))
		else:
			if token == '(':
				opStack.append(token)
			elif token == ')':
				while opStack[len(opStack)-1] != '(':
					n1 = valStack.pop()
					n2 = valStack.pop()
					op = opStack.pop()
					valStack.append(evalx(n2,op,n1))
				opStack.pop()
			else:
				if len(opStack)>0 and opStack[len(opStack)-1]!='(' and \
					getPriority(token) <= getPriority(opStack[len(opStack)-1]):
					
					n1 = valStack.pop()
					n2 = valStack.pop()
					op = opStack.pop()
					valStack.append(evalx(n2,op,n1))
				opStack.append(token)
	while len(opStack)>0:
		n1 = valStack.pop()
		n2 = valStack.pop()
		op = opStack.pop()
		valStack.append(evalx(n2,op,n1))
	return valStack[0]
		

if __name__ == "__main__":
	print("Enter expression: ")
	exp = input()
	
	exp = ' ) '.join(exp.split(')'))
	exp = ' ( '.join(exp.split('('))
	exp = ' + '.join(exp.split('+'))
	exp = ' - '.join(exp.split('-'))
	exp = ' * '.join(exp.split('*'))
	exp = ' / '.join(exp.split('/'))
	
	exp = exp.split(" ")
	for i in range(len(exp)):
		exp[i]=exp[i].strip()
	while '' in exp:
		exp.remove('')
	
	print(solve(exp))
