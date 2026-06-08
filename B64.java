class A extends Thread
{
    public void run ()
    {
        String n=Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(n);
        }
    }
}
class B64
{
    public static void main(String []args)
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

     String n=Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(n);
        }

    }
}