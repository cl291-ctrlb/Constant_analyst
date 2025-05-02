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


//THE MAIN THREAD

//THE MAIN THREAD
//Implementing the Runnable Interface
//Extending the Thread Class


//CREATING MULTIPLE THREADS

//DETERMINING WHEN A THREAD ENDS

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

//SYNCHRONIZING THREADS
//Synchronized Method
//Synchronized Statement

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

// DEADLOCKS IN THREADS

//SUSPENDING, RESUMING AND STOPPING THREADS









