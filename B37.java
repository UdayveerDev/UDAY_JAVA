//MULTIPLE TRY CATCH BLOCK

class B37
{
    public static void main (String []args)
    {
        try 
        {
            int x=12,y=0,c;
            c=x/y;
            System.out.println(c);
        }
        catch (ArithmeticException a)
        {
            System.out.println("can't divide by zero");
        }
        try
        {
            int a[]={10,20,30,40,50};
            System.out.println(a[5]);

        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("array index can't be more than 4 as its size is 5");

        }
    }
}