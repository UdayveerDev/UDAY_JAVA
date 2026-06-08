/*
What is the join() Method?
Purpose: The main purpose of the join() method is to put the currently executing thread into
 a temporary waiting state until the thread on which join() was called completes its execution.

When to use it: If you want a specific, particular thread to execute completely before any other
 threads (even if there are many threads available in the thread pool) can start or resume their
  execution, you use the join() method.
*/
class A extends Thread 
{
    public void run()
    {
        String name =Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}

class B66 
{
    public static void main (String args[])
    {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();

        try
        {
            t2.join();
        }

        catch(InterruptedException i)
        {
            System.out.println(i);
        }

        t1.start();
        t3.start();


    }
}