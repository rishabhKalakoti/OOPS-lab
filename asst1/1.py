# input
print("Input read and imaginary part of first complex no: (a + ib)")
a=float(input())
b=float(input())
print("Input read and imaginary part of second complex no: (c + id)")
c=float(input())
d=float(input())

print("Addition")
print((a+c)," + (", (b+d),")i")
print("Subtraction")
print((a-c)," + (",(b-d),")i")
print("Multiplication")
print((a*c-b*d)," + (",a*d+b*c,")i")
print("Division")
m=c*c+d*d
print((a*c+b*d)/m," + (",(b*c-a*d)/m,")i")


