/*
EXCEPTION PROPAGATION :-

Exception propagation is the process where an unhandled exception moves backward down the call 
stack from the method where it occurred to the calling method. If the calling method also fails
 to handle it,the exception drops to the previous caller. This mechanism repeats until a 
 matching try-catch block resolves the error or it reaches the main() method. 
 If it leaves main() unhandled, the Java Virtual Machine (JVM) terminates 
 the application and dumps the stack trace
*/

/*
     CALL STACK :-


      |                      |
      |                      |
      |----------------------|
      |         m2()         |
      |----------------------|
      |         m1()         |
      |----------------------|
      |        main()        |
      |----------------------|


*/


class B50
{
    public static void main (String []args)
    {
        m1();
        System.out.println("main method ended");
    }
    
    public static void m1()
    {
        m2 ();
    }

    public static void m2()
    {
        try
        {   

            System.out.println(10/0);

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        
    }

}


