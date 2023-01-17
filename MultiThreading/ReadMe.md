---
#1. yield() Method

```
Suppose there are three threads t1, t2, and t3. Thread t1 gets the processor and starts its execution and thread t2 and t3 are in Ready/Runnable state. The completion time for thread t1 is 5 hours and the completion time for t2 is 5 minutes. Since t1 will complete its execution after 5 hours, t2 has to wait for 5 hours to just finish 5 minutes job. In such scenarios where one thread is taking too much time to complete its execution, we need a way to prevent the execution of a thread in between if something important is pending. yield() helps us in doing so. 

The yield() basically means that the thread is not doing anything particularly important and if any other threads or processes need to be run, they should run. Otherwise, the current thread will continue to run.

Use of yield method: 

-> Whenever a thread calls java.lang.Thread.yield method gives hint to the thread scheduler that it is ready to pause its execution. The thread scheduler is free to ignore this hint.
-> If any thread executes the yield method, the thread scheduler checks if there is any thread with the same or high priority as this thread. If the processor finds any thread with higher or same priority then it will move the current thread to Ready/Runnable state and give the processor to another thread and if not – the current thread will keep executing.
-> Once a thread has executed the yield method and there are many threads with the same priority is waiting for the processor, then we can’t specify which thread will get the execution chance first.
-> The thread which executes the yield method will enter in the Runnable state from Running state.
-> Once a thread pauses its execution, we can’t specify when it will get a chance again it depends on the thread scheduler.
-> The underlying platform must provide support for preemptive scheduling if we are using the yield method.
```
#2.sleep() Method
```
This method causes the currently executing thread to sleep for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers. 

 Syntax:

//  sleep for the specified number of milliseconds
public static void sleep(long millis) throws InterruptedException

//sleep for the specified number of milliseconds plus nano seconds
public static void sleep(long millis, int nanos) 
                         throws InterruptedException

Note: 

-> Based on the requirement we can make a thread to be in a sleeping state for a specified period of time
-> Sleep() causes the thread to definitely stop executing for a given amount of time; if no other thread or process needs to be run, the CPU will be idle (and probably enter a power-saving mode).                         
```
#3. join() Method
```
The join() method of a Thread instance is used to join the start of a thread’s execution to the end of another thread’s execution such that a thread does not start running until another thread ends. If join() is called on a Thread instance, the currently running thread will block until the Thread instance has finished executing. The join() method waits at most this many milliseconds for this thread to die. A timeout of 0 means to wait forever 

Syntax:

// waits for this thread to die.
public final void join() throws InterruptedException

// waits at most this much milliseconds for this thread to die
public final void join(long millis) 
              throws InterruptedException

// waits at most milliseconds plus nanoseconds for this thread to die.
The java.lang.Thread.join(long millis, int nanos)

Note:

-> If any executing thread t1 calls join() on t2 i.e; t2.join() immediately t1 will enter into waiting state until t2 completes its execution.
-> Giving a timeout within join(), will make the join() effect to be nullified after the specific timeout.
```

#4. wait() Method 
```
nter-Thread communication is a way by which synchronized threads can communicate with each other using the methods namely wait(), notify() and notifyAll(). wait() method is a part of java.lang.Object class. When wait() method is called, the calling thread stops its execution until notify() or notifyAll() method is invoked by some other Thread.

Syntax:

public final void wait() throws InterruptedException

Working:

-> In java, synchronized methods and blocks allow only one thread to acquire the lock on a resource at a time. So, when wait() method is called by a thread, then it gives up the lock on that resource and goes to sleep until some other thread enters the same monitor and invokes the notify() or notifyAll() method.
-> Calling notify() wakes only one thread and calling notifyAll() wakes up all the threads on the same object. Calling both these methods does not give up the lock on the resource, rather its job is to wake up the threads that have been sent to the sleep state using wait() method.
-> A big difference between sleep() method and wait() method is that sleep() method causes a thread to sleep for a specified amount of time while wait() causes the thread to sleep until notify() and notifyAll() are invoked.
```

#5. notify() Method
```
The notify() method is defined in the Object class, which is Java’s top-level class. It’s used to wake up only one thread that’s waiting for an object, and that thread then begins execution. The thread class notify() method is used to wake up a single thread. If multiple threads are waiting for notification, and we use the notify() method, only one thread will receive the notification, and the others will have to wait for more. This method does not return any value.

It is used with the wait() method, in order to communicate between the threads as a thread that goes into waiting for state by wait() method, will be there until any other thread calls either notify() or notifyAll() method.

Syntax:

public final void notify() ; 

Implementation:

-> The synchronized keyword is used for exclusive accessing.
-> wait() instructs the calling thread to shut down the monitor and sleep until another thread enters the monitor and calls notify().
-> notify() wakes up the first thread that called wait() on the same object

```

#6. Difference Between notify() and notifyAll() 
```
The notify() and notifyAll() methods with wait() methods are used for communication between the threads. A thread that goes into waiting for state by calling the wait() method will be in waiting for the state until any other thread calls either notify() or notifyAll() method on the same object. 

notify(): The notify() method is defined in the Object class, which is Java’s top-level class. It’s used to wake up only one thread that’s waiting for an object, and that thread then begins execution. The thread class notify() method is used to wake up a single thread.

notifyAll(): The notifyAll() wakes up all threads that are waiting on this object’s monitor. A thread waits on an object’s monitor by calling one of the wait methods. The awakened threads will not be able to proceed until the current thread relinquishes the lock on this object.



Now the question is both notify() and notifyAll() the method is used to give notification to the waiting thread, then what is the difference between them or where we should use notify() method and where we should go for the notifyAll() method?


1	Notifications
	In the case of the multiThreading, notify() method sends the notification to only one thread among the multiple waiting threads which are waiting for the send lock.	
    
    While notifyAll() methods in the same context send notifications to all waiting threads instead of a single thread.

2	Thread identifications
	As in the case of notify() method, the notification is sent to a single thread among the multiple waiting threads, so it is sure that which of those waiting threads is going to receive the lock.	
    
    On the other hand, notifyAll() sends a notification to all waiting threads. Hence, it is not clear which of the thread is going to receive the lock.

3	Risk factor
	In the case of notify() method, the risk of thread missing is high as notification is sent only a single thread, and if it misses that, then no other thread would get a notification and hence the lock.	
    
    While in the case of notifyAll(), it sends a notification to all the waiting threads, and hence if any thread misses the notification, there are other threads to do the job. Hence the risk is less.

4	Performance
	Memory and CPU drain is less in notify() method as compared to notifyAll() method as notification is sent to single one thread so performance is better as compared to notifyAll().	
    
    On the other hand, the cost of no notification is dropped and notification is sent to all waiting threads, the memory and CPU drain is more as compared to notify() and hence performance of notifyAll() is lesser.

5	Interchangeable
	In the case of the notify() method, only a single thread is in the picture hence no concept of thread Interchangeable is possible.	
    
    While we should go for notifyAll() if all your waiting threads are interchangeable (the order they wake up doesn’t matter).
```
#7. Method and Block Synchronization in Java
```
Method Synchronization

Synchronized methods enables a simple strategy for preventing the thread interference and memory consistency errors. If a Object is visible to more than one threads, all reads or writes to that Object’s fields are done through the synchronized method.

It is not possible for two invocations for synchronized methods to interleave. If one thread is executing the synchronized method, all others thread that invoke synchronized method on the same Object will have to wait until first thread is done with the Object.

>>>>>>>>>>><<<<<<<<<<<<<<>>>>>>>>>>>>>>

Block Synchronization

If we only need to execute some subsequent lines of code not all lines (instructions) of code within a method, then we should synchronize only block of the code within which required instructions are exists.
For example, lets suppose there is a method that contains 100 lines of code but there are only 10 lines (one after one) of code which contain critical section of code i.e. these lines can modify (change) the Object’s state. So we only need to synchronize these 10 lines of code method to avoid any modification in state of the Object and to ensure that other threads can execute rest of the lines within the same method without any interruption.
```    
---
