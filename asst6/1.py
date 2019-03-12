import threading
import time

first=0
second=0
s1=0
s2=0
def Generate1(lock):
    lock.acquire()
    global first,s1
    print("Thread name:",threading.current_thread().name,end="  ")
    
    for i in range (1,first):
        if(first%i ==0):
            s1+=i
    lock.release()

    
    
def Generate2(lock):
    lock.acquire()
    global second,s2
    print("Thread name:",threading.current_thread().name,end="  ")
    for i in range (1,second):
        if(second%i ==0):
            s2+=i
    lock.release()

if __name__ == "__main__":
    lock=threading.Lock()
	first=int(input("Enter first number:"))
    second=int(input("Enter second number:"))
    t1=threading.Thread(target=Generate1, args=(lock,),name="CSA")
    t2=threading.Thread(target=Generate2, args=(lock,),name="CSB")

    t1.start()
    # time.sleep(2)
    t2.start()
    t1.join()
    t2.join()
    print(first,second,s1,s2)
    if(first==s2 and second==s1):
        print("Numbers are amicable")
    else:
        print("Numbers are not amicable")
        

    
    
