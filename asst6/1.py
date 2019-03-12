import threading
import time

first=0
second=0
s1=0
s2=0
def f1(lock):
    lock.acquire()
    global first,s1
    for i in range(1,first):
        if(first%i ==0):
            s1+=i
    lock.release()

    
    
def f2(lock):
    lock.acquire()
    global second,s2
    for i in range(1,second):
        if(second%i ==0):
            s2+=i
    lock.release()

if __name__ == "__main__":
	#global first,second
	lock=threading.Lock()
	first=int(input("Enter first number:"))
	second=int(input("Enter second number:"))
	t1=threading.Thread(target=f1, args=(lock,),name="CSA")
	t2=threading.Thread(target=f2, args=(lock,),name="CSB")
	t1.start()
	t2.start()
	t1.join()
	t2.join()
	if(first==s2 and second==s1):
		print("Numbers are amicable")
	else:
		print("Numbers are not amicable")
    
    
