/*
NESTED TRY BLOCK:-
A try block which contains inside another try block is called nested try block. 
*/

class B39
{
    public static void main(String []args)
    {
        try
        {
            System.out.println("this is the parent try");
            try
            {
                int a=13 ,b=0,c;
                c=a/b;
                System.out.println(c);

            }
            catch (ArithmeticException e)
            {
                System.out.println("Arithmetic exception");

            }

            int arr[]=new int[4];
            arr[5]=10;  // throw an exception 

        }
        catch (ArrayIndexOutOfBoundsException t)
        {
            System.out.println("Array Index Out of bound Exception");
        }

        System.out.println("main method ended here");
    }
}