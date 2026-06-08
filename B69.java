/*
Definition: stop() is a method of the Thread class.

Function: It is used to terminate a thread permanently. 
Once a thread is stopped using this method, it is "killed" 
and moves directly to the Dead state.

Resumption: A thread that has been stopped cannot be restarted or resumed again.

Deprecation Note: The compiler often gives a warning stating that it uses
 a "deprecated API." In modern Java development, the stop() method is considered
  unsafe and is deprecated, though it is still taught for conceptual understanding.
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
class B69
{
    public static void main (String []args )
    {
        try
        {
            A t1 = new A();
            A t2 = new A();
            A t3 = new A();

           t1.setName("t1 thread");
           t2.setName("t2 thread");
           t3.setName("t3 thread");

           t1.start();
           t2.start();
           t3.start();
           t2.stop();  //it sent thread from running to dead state
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println(e);
        }
    }
}