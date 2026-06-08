// interrupt() method

/*
Definition: interrupt() is a method of the Thread class in Java.

Function: It is used to interrupt a thread, signaling it to stop what it is doing.

Key Condition for Execution: The interrupt() method only works if the thread is in a 
sleeping or waiting state (e.g., via Thread.sleep() or wait()
*/
class A extends Thread 
{
    public void run ()
    {
        try
        {
            for (int i=1;i<=5;i++)
            {
                System.out.println("t1 thread running....");
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException i)
        {
            System.out.println("t1 thread terminated..");

        }
    }
}

class B71
{
    public static void main (String args [])
    {
        A t1 = new A();
        t1.start();

        t1.interrupt();
    }
}