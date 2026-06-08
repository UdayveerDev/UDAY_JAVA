// BY EXTENDING THREAD CLASS 


/* IT TAKES 5 SEC TO EXECUTE PROGRAM
class A extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for (int i=1;i<=5;i++)
          {
            System.out.println("udayveer singh");
            Thread.sleep(1000);
          }
        }

        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
    }
}
class B62
{
    public static void main(String []args)
    {
        A t=new A();
        t.start(); 
    try
     {
      for (int i=1;i<=5;i++)
        {
            System.out.println("sandeep pathak");
            Thread.sleep(1000);
        }
     }
    catch(InterruptedException i)
     {
        System.out.println(i);
     }
    }
}
*/


/* IT TAKES 10 SECONDS TO EXECUTE THE PROGRAM  MEANS DOUBLE OF THE PREVIOUS BECAUSE IT HAS FUN() METHOD 
class A extends Thread
{
    public void fun()
    {
        try
        {
            for (int i=1;i<=5;i++)
         {
            System.out.println("sandeep pathak ");
            Thread.sleep(1000);
         }
        }
        catch(InterruptedException i)
        {
            System.out.println(i);
        }
    }
}

class B62 
{
    public static void main (String args[])
    {
        A t=new A();
        t.fun();


        try
        {
            for (int i=1;i<=5;i++)
         {
            System.out.println("udayveer singh");
            Thread.sleep(1000);
         }
        }
        catch (InterruptedException j)
        {
            System.out.println(j);
        }
    }
}

*/
