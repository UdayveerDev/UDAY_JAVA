/*
1. The suspend() Method
Purpose: The main purpose of the suspend() method is to pause the execution of a thread. 
It takes a thread that is currently in the running state and forcibly moves it into a
 waiting state (blocking state).

Behavior: When a thread is suspended, its execution is halted indefinitely. 
It will not continue to execute any further code until it is explicitly told to do so.

Real-Life Analogy: Just like a student who is suspended from school cannot attend classes
 until the suspension is lifted, a suspended thread cannot continue its execution until it
  is explicitly resumed.

2. The resume() Method
Purpose: The resume() method is exclusively used to restart a thread that has been previously
 paused using the suspend() method.

Behavior: It takes the suspended thread from the waiting state and puts it back into the 
ready/runnable state, allowing the thread scheduler to pick it up and resume its execution 
from exactly where it was paused.

Dependency: The resume() method only works in conjunction with the suspend() method.
 It has no effect on a thread that is waiting due to sleep(), wait(), or join()

*/

class A extends Thread 
{
    public void run()
    {
        String name =Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}
class B67
{
    public static void main(String []arga) throws InterruptedException
    {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t2.suspend(); // t2 pause
        t3.start();
        t2.resume();  // t2 restarted
    }
}


//these methods have depreciated it will throw error 