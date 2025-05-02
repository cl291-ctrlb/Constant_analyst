// multithreaded programming
/*
 Thread is the smallest unit of an executable code in a program. It helps you divide a process into multiple
parts to speed up the process. A process is a program that executes in the memory as a single thread.
Programs that run as a single thread can cause problems when you perform two or more tasks
simultaneously. 
*/

public class SingleThreadExample {
  public static void main(String[] args) {
      showUI();
      downloadFile();
      System.out.println("You can now use the app.");
  }

  static void showUI() {
      System.out.println("Welcome to the app!");
  }

  static void downloadFile() {
      System.out.println("Download started...");
      try {
          Thread.sleep(5000);  // Simulate download time
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      System.out.println("Download finished.");
  }
}

/*
 SingleThreadExample.java	Human-readable source code (you write this)
SingleThreadExample.class	Bytecode compiled from .java (machine-readable, JVM executes this)
 */

/*
 MULTITHREADING FUNDAMENTALS
Threads are used to implement concurrency in Java programs. Concurrency is the simultaneous
execution of multiple tasks. These multiple tasks can be implemented either asseparate processes or
as a set of threads within a single program. For example, working in a word processor while listening
an audio file on the same computer are two tasksimplemented as two separate processes. However,
you often need a single program or process to perform multiple tasks at the same time, such as a word
processor that can check spellings of words in a document while you are writing the document. In this
example, the word processor is a single program that performs two tasks simultaneously that is checking
the spelling and writing a document. These two tasks are implemented as two separate threads within
a word processor process.

Threads are lightweight processes because less resource is required to create a new thread than to
generate a new process. For example, a newly created thread shares the same address space with other

threads in a program, whereas every individual process has its own separate address space. Therefore,
creating a thread involves less overhead than creating a process.

The objective of multithreading is to utilize the idle time of Central Processing Unit (CPU). For example,
in case of a program taking input from a user, the CPU is idle until the user enters a character from
the keyboard or moves the mouse, which may take several seconds. Multithreading uses fractions of
a second in between the keyboard strokes to process the instructions from different parts of the same
program. Therefore, multithreading helps in proper utilization of the processing time of the CPU. Some
important uses of threads are as follows:
 Act as server-side programs to serve the needs of multiple clients on a network or the Internet. On
the Internet, the server has to cater the needs of thousands of clients at a time. For handling multiple
clients simultaneously, threads are used.
 Create games and animations. For example, you can use threads to show a picture in motion. In
such a case, you have to set it in such a way that it sleeps and gets activated for some specific period
of time, and this cycle continues. In this way, threads can be used to create animations.
 Perform more than one task simultaneously, thereby leading to proper utilization of the CPU
resources
*/

class SpellCheckTask extends Thread{
    public void run(){
        for (int i =1; i<=5 ; i++){
            System.out.println("Spelling checking word");
            try{
                Thread.sleep(1000); //simulates time taken for spell check
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class TypingTask extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("typing word"+i);
            try{
                Thread.sleep(1200); // simulates typing speed
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingExample{
    public static void main(String[] args) {
       SpellCheckTask spellCheckTask = new SpellCheckTask();
        TypingTask typing = new TypingTask();

        spellCheckTask.start(); // spell start checking thread
        typing.start();// start typing thread
    }
}

/*
 Thread Life Cycle
Threads provide multiple paths in a program to execute different tasks simultaneously. To understand
how a thread works, it is important to understand the life cycle of a thread. The life cycle of a thread is
a series of states that a thread undergoes to perform a task. The various states that the life cycle of a
thread undergoes are as follows:
 Creating a thread: Represents the state when an instance of a thread is created. At this point, the
thread is not alive. There are two waysto create new threads.One way to create a thread isto declare a
class to be a subclass of the Thread class. The subclass must override the run() method of the Thread
class. Threads can also be created by declaring a class that implements the Runnable interface. This
declared class then implements the run() method. When a new instance of a thread class is created,
no system resources are allocated for it. To allocate system resources to a new instance of a thread,
the start() method is used. Calling any method other than the start() method, when the thread is in
thisstate (when the thread is newly created and not alive), raisesthe IllegalThreadStateException
exception at runtime.
 Starting a thread: Signifies the state when the start() method is called on a thread. When the start()
method is called on a thread, the system resources required to run the thread are created, the
execution of the thread is scheduled, and the run() method is called on the thread. Once a call to the
run() method is made, the thread starts running.
 Non-runnable state of a thread: Specifies a thread state that occurs when the thread stops executing
because it is either sleeping or waiting for resources that are held by another thread. A running
thread can enter a non-runnable state.
 Blocked: Signifies a thread state that occurs when the thread has to wait for Input/Output (I/O)
resources held by another thread.
Sleeping: Denotes a thread state when the thread is alive but not runnable. A sleeping thread might
return to the runnable state on occurrence of a particular event. In this state, a thread sleeps for a
specified period of time. To stop the execution of a thread, you can call its stop() method.
 Waiting for notification: Represents a thread state where the thread waits for notification from
another thread, that is, whenever a resource is being utilized by a thread, other threads wait for
the notification from that thread. Through notification, a thread informs other threads that the
resource being utilized by the thread is now free and can be accessed.
 Terminating a thread: Signifies a thread state when the execution of the run () method of the thread
has completed. Once the thread is in this state, it never run again.

A thread does not start executing until an object of the thread is created

*/
class MyThread extends Thread{
    public void run(){
        try{
            System.out.println("thread started");
            Thread.sleep(2000);
            System.out.println("thread is still running");
            Thread.sleep(2000);
            System.out.println("thread is executing");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycleExample{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("thread creatd , but not yet started");
        thread.start();
        System.out.println("thread started , now running");
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("main thread finished , mythread has teminated ");
   }
}
/*
 Synchronization of Threads(serialization)
 a mechanism to ensure that no two concurrently
executing threads possess the same parts of a program at the same time. If a thread holds some part of
a process to access, the other thread must wait till the execution of the first thread finishes.

two synchronization techniques:
 To control the order in which the code is executed to perform different tasks
 To prevent the obstacles that can arise when two threads share the same resource at the same time
 
*/
// BankAccount class represents a shared resource that multiple threads will access



class BankAccount{
    private int balance = 1000; // // Shared resource (balance) to be accessed by multiple threads

    // Synchronized method to ensure only one thread can access it at a time
    // This prevents race conditions when multiple threads try to update balance
    public synchronized void withdraw(int amount){
        // Checking if balance is sufficient to perform the withdrawal
        if (balance >= amount){
            // Output the thread's name and the amount it's withdrawing
            System.out.println(Thread.currentThread().getName()+"is withdraw"+ amount);
             // Subtract the amount from the balance (critical section)
                balance -= amount;
               // Display the new balance after withdrawal
               System.out.println("new balance"+balance); 
        }else{
            System.out.println(Thread.currentThread().getName()+"insufficient balance");
        }
    }
} 

// AccountUser class represents a user who will attempt to withdraw money from the shared bank account
class AccountUser extends Thread {
    private BankAccount account;
    private int amount;
    public AccountUser(BankAccount account, int amount){
        this.account = account;
        this.amount = amount;
    }
    // Override the run() method to execute the withdrawal process
    //Override
    public void run(){
        account.withdraw(amount);
    }

}

public class ThreadSynchronizationExample{
    public static void main(String[] args){
        BankAccount account =new BankAccount();
        AccountUser user1 = new AccountUser(account, 500);
        AccountUser user2 = new AccountUser(account, 500);
        user1.start();
        user2.start();
    }
}




/*  
 Multithreaded Custom Class Loader

  avoid deadlocks by following these rules
  Ensure that the custom class loader for the concurrent class loading is safe.
Decide for the internal locking scheme. Example: java.lang.ClassLoader uses the locking
schemebased on the name of class that is requested.
Remove all synchronization on the lock of the class loader object
Ensure that critical sections are protected in case of multiple threads loading different
classes.

Invoke java.lang.ClassLoader’s static method registerAsParallelCapable(). This signifies that all the
instances of the custom class loader are safe.
*/
// CustomClassLoader.java
// A custom class loader that safely supports multithreaded class loading
public class CustomClassLoader extends ClassLoader {
  // Static block to register this loader as parallel-capable (safe for multi-threading)
  static {
      // Ensures thread-safety when multiple threads load different classes
      registerAsParallelCapable();
  }

  // Constructor that passes the parent class loader
  public CustomClassLoader(ClassLoader parent) {
      super(parent);
  }

  // Overriding findClass for demonstration purposes
  @Override
  protected Class<?> findClass(String name) throws ClassNotFoundException {
      // In real scenarios, bytecode would be read and defined here
      System.out.println(Thread.currentThread().getName() + " is loading class: " + name);

      // For demonstration, simulate the case where we can't find the class
      throw new ClassNotFoundException("Dummy loader: class not found " + name);
  } //To test the custom loader with multiple threads, you can use the following TestCustomClassLoader.java:
}

//TestCustomClassLoader.java
public class TestCustomClassLoader {
    public static void main (String[] args) {
        // Create an instance of the custom class loader
        CustomClassLoader loader = new CustomClassLoader(TestCustomClassLoader.class.getClassLoader());
        
        // Create multiple threads to simulate parallel class loading
        Thread thread1 = new Thread(() -> {
            try {
                loader.loadClass("com.example.MyClass1");  // Corrected method name
            } catch (ClassNotFoundException e) {
                System.out.println("Thread 1 failed to load class");
            }
        }, "Thread-1");  // Corrected thread name

        Thread thread2 = new Thread(() -> {
            try {
                loader.loadClass("com.example.MyClass2");  // Corrected method name
            } catch (ClassNotFoundException e) {
                System.out.println("Thread 2 failed to load class");
            }
        }, "Thread-2");  // Corrected thread name

        // Start both threads
        thread1.start();
        thread2.start();
    }
}


//THE MAIN THREAD
//Implementing the Runnable Interface
//Extending the Thread Class
class MyRunnable implements Runnable{
  @Override
  public void run(){
    System.out.println(Thread.currentThread().getName()+"is executing the runnable task");
  }
}
// Approach 2: Extending the Thread Class
class MyThread extends Thread {
  @Override
  public void run(){
    System.out.println(Thread.currentThread().getName()+"is executing task");
    
  }
}
//main class
public class MyThreadExample {
  public static void main(String[] args) {
      // Creating a thread using Runnable interface
      MyRunnable myRunnable = new MyRunnable();
      Thread thread1 = new Thread(myRunnable);
      thread1.start(); // Start the thread created using Runnable

      // Creating a thread by extending the Thread class
      MyThread thread2 = new MyThread();
      thread2.start(); // Start the thread created using Thread

      // Main thread's execution
      System.out.println(Thread.currentThread().getName() + " is main thread");
  }
}
/*
 abey yaar barr barr krna pd rha
 /c/Users/E-LIBRARY-15/OneDrive/Desktop/java
javac MyThreadExample.java
java MyThreadExample

 */

//CREATING MULTIPLE THREADS
class MyRunnableTask implements Runnable{
  private String taskName;
  public MyRunnableTask(String name){
    this.taskName = name;
  }
  @Override
  public void run(){
    System.out.println(Thread.currentThread().getName()+"is running"+taskName);
  }
}
// Thread class
class MyThreadTask extends Thread{
  private String taskName;
  public MyThreadTask(String name){
    this.taskName = name;
  }
  @Override
  public void run(){
    System.out.println(getName()+"is running"+ taskName);
  }
}
// Main class
public class MultipleThreadsExample{
  public static void main(String[] args){
    // Using Runnable
Thread t1 = new Thread(new MyRunnableTask("running task 1"));
Thread t2 = new Thread(new MyRunnableTask("running task 2"));
  
// Using Thread
MyThreadTask t3 =new MyThreadTask("Thread task 1");
MyThreadTask t4 =new MyThreadTask("Thread task 2");

// Start all threads
t1.start();
t2.start();
t3.start();
t4.start();
// Main thread
System.out.println(Thread.currentThread().getName()+"is main thred");
}
}
//DETERMINING WHEN A THREAD ENDS
class MyTask extends Thread{
  private String taskName;
  public MyTask(String name){
    this.taskName = name;
  }
  @Override
  public void run(){
    System.out.println(taskName+"started by"+Thread.currentThread().getName());
    try{
      Thread.sleep(2000);
    }catch (InterruptedException e){
      System.out.println(taskName+"was interrupted");
    }
    System.out.println(taskName+"completed by"+Thread.currentThread().getName());
  }
}
public class ThreadEndExample{
  public static void main(String[] args){
    MyTask thread1 = new MyTask("Task-1");
    MyTask thread2 = new MyTask("Task-2");

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }
    catch(InterruptedException e){
      System.out.println("main thread was interrupted");
    }
    System.out.println("both threads have finished.main threds ends");
  }
}
//THREAD PRIORITIES
/*In Java, there is a program in Java Virtual Machine (JVM) called thread scheduler, which decides how
a thread will execute and how much time will be allocated to the thread to execute. Threads with high
priority get more CPU time and therefore execute earlier as compared to the threads having less priority.
A thread can have priority 1 to 10. Priority of a thread can be set by using the setPriority() method of
the Thread class. The setPriority () method either accepts an integer value ranging from 1 to 10 or the
constants defined in the Thread class, which are asfollows:
 MIN_PRIORITY: Represents the minimum priority of a thread whose value is 1. If this constant is
passed in the setPriority () method, then the priority of the thread will be 1.
 NORM_PRIORITY: Signifies the normal priority of a thread whose value is 5. If this constant is passed
in the setPriority () method, then the priority of the thread will be 5.
 MAX_PRIORITY: Indicates the maximum priority of a thread whose value is 10. Passing
this constant in the setPriority () method will set the priority of the thread to maximum, that is, 10.
*/
class MypriorityThread extends Thread{
  public MypriorityThread(String name){
    super(name); // set thread name
  }
  @Override
  public void run(){
    System.out.println(getName() + "is running with priority" + getPriority());

  }
}
public class ThreadProrityExample{
  public static void main(String[] args){
    MypriorityThread thread1 = new MypriorityThread("low priority thread");
    MypriorityThread thread2 = new MypriorityThread("normal priority thread");
    MypriorityThread thread3 = new MypriorityThread("high priority thread");
    // Setting priorities
    thread1.setPriority(Thread.MIN_PRIORITY);
    thread2.setPriority(Thread.NORM_PRIORITY);
    thread3.setPriority(Thread.MAX_PRIORITY);
    // Starting all threads
    thread1.start();
    thread2.start();
    thread3.start();

  }
}
//SYNCHRONIZING THREADS
//Synchronized Method
//Synchronized Statement
class Counter{
  private int count = 0;
      // Synchronized method
  public synchronized void increment(){
    count++;
  }
  public int getCount(){
    return count;
  }
}
public class SynchronizedMethodExample {
  public static void main(String[] args){
      Counter counter = new Counter();
// Creating multiple threads to increment the counter
    Thread thread1 = new Thread(() ->{
      for (int i = 0; i<1000; i++){
        counter.increment();
      }
    });
    Thread thread2 = new Thread(() -> {
      for(int i = 0; i<1000; i++){
        counter.increment();
      }
    });
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    }catch (InterruptedException e){
      e.printStackTrace();
    }
    System.out.println("final count"+counter.getCount());
  }

}
/*INTERTHREAD COMMUNICATION
Often, threads will need to coordinate between themselves, especially when the output of one thread is
used by another thread. One way of coordinating threads is to use the wait(), notify(), and notifyAll()
methods:
 wait()—It makes a thread sleep until notify() or notifyAll() method is called.
 notify()—It starts the first thread that called wait() on the same object.
 notifyAll()—It starts all the threads that called wait() on the same object.
The usual process is for the reader thread to call wait()method and the writer thread to call notify()
method when the data the reader wants to read is ready. Here’s an example. In this case, a writer thread
will call an object’s doWork() method, which is a time-consuming method, to write some data, and a
reader thread will call the same object’s getResult() method to read the results. Clearly, we want the
reader thread to have to wait until doWork()method is done. Therefore, all we have to do is call wait() in
getResult()method to make the reader thread wait and call notify()method in doWork() when the writer
thread is done, and the data is ready to be read.
*/
class ShareData {
  private String data;
  private boolean isDataReady = false;

  // writer method
  public synchronized void doWork(String value) {
    System.out.println("Writer is writing data");
    data = value;
    try {
      Thread.sleep(2000); // simulate time-consuming work
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    isDataReady = true;
    notify(); // notify reader that data is ready
    System.out.println("Writer has finished writing data");
  }

  // reader method
  public synchronized String getResult() {
    while (!isDataReady) {
      try {
        wait(); // wait for writer to write data
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return data;
  }
}

public class InterThreadCommunicationExample {
  public static void main(String[] args) {
    ShareData shared = new ShareData();

    // reader thread
    Thread reader = new Thread(() -> {
      System.out.println("Reader is waiting for data");
      String result = shared.getResult();
      System.out.println("Reader received data: " + result);
    });

    // writer thread
    Thread writer = new Thread(() -> {
      shared.doWork("Important result from writer");
    });

    reader.start();
    writer.start();
  }
}



// DEADLOCKS IN THREADS
class A{
  synchronized void methodA(B b){
    System.out.println("thread 1 locked a , try to call method b");
    b.last();
  }
  synchronized void last(){
    System.out.println("thread 1 inside a' s last method");
  }
}
class B{
  synchronized void method(A a){
    System.out.println("Thread 2: Locked B, trying to call method A");
    a.last();
  }
  synchronized void last(){
    System.out.println("Thread 2: Inside B's last method");
  }
}
public class DeadlockExample{
  public static void main(String [] args){
     A a = new A();
     B b = new B();
     // // Thread 1 trying to access methodA() of class A
     Thread t1 = new Thread(()-> a.methodA(b));
     // Thread 2 trying to access methodB() of class B
     Thread t2 = new Thread(()-> b.method(a)
     );
     t1.start();
     t2.start();
    
  }
}

//SUSPENDING, RESUMING AND STOPPING THREADS
class ThreadControl {
  private volatile boolean suspended = false;
  private volatile boolean stopped = false;

  // Method to suspend a thread
  public synchronized void suspendThread() {
      suspended = true;
  }

  // Method to resume a suspended thread
  public synchronized void resumeThread() {
      suspended = false;
      notify();
  }

  // Method to stop a thread
  public synchronized void stopThread() {
      stopped = true;
      notify();
  }

  public void runTask() {
      while (!stopped) {
          synchronized (this) {  // Suspend the thread if needed
              while (suspended) {
                  try {
                      wait(); // Wait until resumed
                  } catch (InterruptedException e) {
                      System.out.println("Thread interrupted");
                  }
              }
          }
          System.out.println(Thread.currentThread().getName() + " is running");
          try {
              Thread.sleep(500); // Simulate time-consuming task
          } catch (InterruptedException e) {
              System.out.println("Thread interrupted during sleep");
          }
      }
      System.out.println(Thread.currentThread().getName() + " has stopped");
  }
}

public class SuspendResumeStopExample {
  public static void main(String[] args) {
      ThreadControl control = new ThreadControl();

      // Creating a thread that runs the task
      Thread thread1 = new Thread(() -> {
          control.runTask();
      }, "thread1");

      // Starting the thread
      thread1.start();

      // Suspend the thread after 2 seconds
      try {
          Thread.sleep(2000);
          System.out.println("Suspending thread");
          control.suspendThread();

          // Wait for 2 seconds before resuming
          Thread.sleep(2000);
          System.out.println("Resuming thread");
          control.resumeThread();

          // Wait for 2 seconds before stopping
          Thread.sleep(2000);
          System.out.println("Stopping thread");
          control.stopThread();
      } catch (InterruptedException e) {
          System.out.println("Main thread interrupted");
      }
  }
}








