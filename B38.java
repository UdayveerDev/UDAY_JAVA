// multiple catch block 
class B38 
{
    public static void main (String []args)
    {
        try 
        {
            int a=12,b=0,c;
            c=a/b;
            System.out.println(c);

            int d[] ={1,2,3,4,5};
            System.out.println(d[5]);

            String str=null;
           System.out.println(str.toUpperCase());

        }

        catch (ArithmeticException n)
        {
            System.out.println("can't divide by zero");

        }

        catch (ArrayIndexOutOfBoundsException m)
        {
            System.out.println("beyond the range");
        }

        catch (Exception o)
        {
            System.out.println("null pointer errror");
        }
    }
}