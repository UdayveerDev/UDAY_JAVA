/*
NESTED CATCH BLOCK:-
A catch block having catch block inside it is called nested catch block . 

*/

class B40
{
    public static void main (String []args)
    {
        try
        {
            int a=14 ,b=0,c;
            c=a/b;
            System.out.println(c);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            try
            {
                int arr[]={1,2,3,45,5};
                System.out.println(arr[5]);

            }
            catch(ArrayIndexOutOfBoundsException g)
            {
                System.out.println("Array index out of bound exception");
                
            }
        }


        System.out.println("main method ended here");
    }
}
