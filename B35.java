/*try catch finally */

/*

// CASE:1:- NO EXCEPTION IN TRY AND FINALLY BLOCK
class B35
{
    public static void main(String []args)
    {
         try
    {
        System.out.println("learn something");
        int a=20,b=2,c;
        c=a/b;
        System.out.println(c);
        System.out.println("like and share");
    }
    catch (ArithmeticException e)
    {
        System.out.println("can't divide by zero");
    }
    finally
    {
        System.out.println("subscribe");
    }
    System.out.println("main method ended");
    }
}

*/
// expected output 
/*

learn something
10
like and share
subscribe
main method ended

*/


// CASE:2:- IF EXCEPTION IS PRESENT IN TRY BLOCK AND NOT IN FINALLY BLOCK
/*
class B35
{
    public static void main(String []args)
    {
         try
    {
        System.out.println("learn something");
        int a=20,b=0,c;  // EXCEPTION
        c=a/b;
        System.out.println(c);
        System.out.println("like and share");
    }
    catch (ArithmeticException e)
    {
        System.out.println("can't divide by zero");
    }
    finally
    {
        System.out.println("subscribe");
    }
    System.out.println("main method ended");
    }
}
*/


/*
EXPECTED OUTPUT :-
    learn something
    can't divide by zero
    subscribe
    main method ended
*/


// CASE:3:- EXCEPTION MISSMATCHED 
/*

class B35
{
    public static void main(String []args)
    {
         try
    {
        System.out.println("learn something");
        int a=20,b=0,c;  
        c=a/b;          // ArithmeticException 
        System.out.println(c);
        System.out.println("like and share");
    }
    catch (NullPointerException e)  // NullPointerException 
    {
        System.out.println("can't divide by zero");
    }
    finally
    {
        System.out.println("subscribe");
    }
    System.out.println("main method ended");
    }
}

*/


/*
EXPECTED OUTPUT :-
    learn something
    subscribe
    
*/

// CADE 4 :- PUT THE EXCEPTIONAL PART CODE IN THE CATCH BLOCK
/*
class B35
{
    public static void main(String []args)
    {
         try
    {
        System.out.println("learn something");
        System.out.println("like and share");
    }
    catch (ArithmeticException e)  // NullPointerException 
    {
         int a=20,b=0,c;  
        c=a/b;          // ArithmeticException 
        System.out.println(c);
        System.out.println("can't divide by zero");
    }
    finally
    {
        System.out.println("subscribe");
    }
    System.out.println("main method ended");
    }
}

*/



/*
EXPECTED OUTPUT:-
    learn something
    like and share
    subscribe
    main method ended
*/


