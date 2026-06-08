/*
Definition: isAlive() is a method of the Thread class in Java.

Purpose: It is used to check whether a specific thread is currently alive
 (running/active) or not.

Return Type: The method returns a boolean value (true or false).

Returns true: If the thread has been started and has not yet died (it is in the 
runnable or running state).

Returns false: If the thread has not been started yet, or if it has already 
finished its execution (dead state).

Key Rules & Behaviors
Before start(): If you call isAlive() on a thread before invoking its start() method,
 it will return false. This is because the thread hasn't actually been initialized in
  the Thread Scheduler yet.

After start(): If you call isAlive() on a thread after invoking its start() method, 
it will return true (assuming the thread is still executing its task).

Double Starting: You cannot start the same thread twice. If you call start() on a thread 
that has already been started, Java will throw an IllegalThreadStateException, 
regardless of what isAlive() returns.

Example Code Logic
*/

class A extends Thread 
{
    public void run()
    {
        System.out.println("isAlive method program...!" );
    }
}

class B70
{
    public static void main (String []args)
    {
        A t1 = new A();
        A t2 = new A();


    System.out.println(t1.isAlive());
        t1.start();

    System.out.println(t1.isAlive());    
        t2.start();
    }
}