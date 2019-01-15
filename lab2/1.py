class Complex(real,img):
	def __init__(self, real, img):
		self.real=real
		self.img=img
	def __add__(self, b):
		return Complex(self.real+b.real, self.img+self.img)
	def __sub__(self, b):
		return Complex(self.real-b.real, self.img-self.img)
	def __mul__(self, b):
		return Complex(self.real*b.real-self.img*b.img,self.real*b.img+self.img*b.real)
	def __floatdiv__(self, b):
		m = b.real*b.real + b.img*b.img
		if m==0:
			print("Invalid Input!")
			exit()
		return  Complex((self.real*b.real+self.img*b.img)/m,(self.img*b.real-self.real*b.img)/m)

def printComplex(a):
	print(a.self, '+', a.img,"i")
	
def getInput():
	print("Input real and imaginary part of first complex no: (a + ib)")
	a=float(input())
	b=float(input())
	print("Input real and imaginary part of second complex no: (c + id)")
	c=float(input())
	d=float(input())
	return a,b,c,d

if __name__ == "main":
	a,b,c,d=getInput()
	x = Complex(a,b)
	y = Complex(c,d)
	printComplex(x)
	
	
	
