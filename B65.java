// sleep() method in java

/*
What is the sleep() Method?
Static Method: sleep() is a static method belonging to the Thread class in Java. 
Because it is static, you do not need to create an object of the Thread class to call it;
 you can call it directly using the class name (i.e., Thread.sleep()).

Purpose: The primary purpose of the sleep() method is to temporarily put the currently 
executing thread into a "waiting state" (or temporary sleep state).
*/
class A extends Thread 
{
    public void run ()
    {
        try
        {
            String n=Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(n);
            Thread.sleep(1000);
        }

        }
        catch(InterruptedException i)
        {
            System.out.println(i);
        }
        
    }
}

class B65
{
    public static void main (String []args)
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();

    }
}