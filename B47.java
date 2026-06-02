// throw and throws in java 

//best method 
class B47 
{
    void div(int a ,int b) throws ArithmeticException  // throw the error to the caller i.e main method 
    {
        if (b==0)
        {
            throw new ArithmeticException();
        }
        else 
        {
            int c=a/b;
            System.out.println(c);
        }
    }

    public static void main (String []args)
    {
         B47 r=new B47();

         // handling the exception using try catch block by main method 
        try
        {
             r.div(12,0);
        }
        catch(Exception e)
        {
            System.out.println("The value of b is zero");
        }
    }
}


// when the main method is also throws it to jvm 
/*
class B47 
{
    void div(int a ,int b) throws ArithmeticException  // throw the error to the caller i.e main method 
    {
        if (b==0)
        {
            throw new ArithmeticException();
        }
        else 
        {
            int c=a/b;
            System.out.println(c);
        }
    }

    public static void main (String []args) throws ArithmeticException
    {
         B47 r=new B47();
        r.div(12,0);

         System.out.println("main method ended");
    }
}
*/