// try, catch and finally inside finally block 
class B42 
{
    public static void main (String abc[])
    {
        try
        {
            String a="udayveer";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
        finally
        {
           
             try 
             {
                     System.out.println(10/0);
             }
             catch(ArithmeticException a)
             {
                System.out.println(a);
             }
             finally
             {
                System.out.println("this is finally block");
             }
        }
        System.out.println("main method ended here");
    }
}