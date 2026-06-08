/*
Definition: yield() is a static method of the Thread class.

Function: It pauses the execution of the currently running thread
 and gives a chance to other waiting threads of the same priority to execute.

Priority Rule: If the threads do not share the same priority, the yield() 
method will not have any effect.

Thread Scheduler (TS) Role: Calling yield() merely sends a request to the Thread Scheduler.

If the Thread Scheduler accepts the request, the current thread pauses.

If the Thread Scheduler ignores the request, the current thread continues executing normally.

Unpredictability: Because the Thread Scheduler controls the execution flow, you cannot
 predict the exact output or guarantee that yield() will always pause the thread immediately.
*/

class thread1 extends Thread
{
    public void run()
    {
        String name =Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(name);
            Thread.yield();
        }
    }
}

class thread2 extends Thread 
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

class B68
{
    public static void main(String []args)
    {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.setName("thread1");
        t2.setName("thread2");


        t1.start();
        t2.start();
    }
}
