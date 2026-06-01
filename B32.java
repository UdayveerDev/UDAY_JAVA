/*
What is an Exception?
An exception is an unexpected, unwanted, and abnormal situation that occurs at runtime 
and disrupts the normal flow of the program.

If an exception is not handled, the program immediately terminates at the exact line
 where the exception occurred, ignoring the rest of the code.

Real-life Analogies for Exceptions:

Power Cut Exception: You are 90% done building a project but haven't saved it.
 Suddenly, the power goes out. The program closes abnormally, and your work is lost.

Illness Exception: A group is on a tour, and suddenly a member falls sick.
 This is an unexpected/unwanted situation that stops the trip from continuing normally.

What is Exception Handling?
Exception handling is a mechanism that provides an alternate source/path to handle
 the runtime error so that the normal flow of the program is maintained.

Why handle exceptions? In interviews, the standard answer to "Why handle exceptions?"
 is to maintain the normal execution flow of the program so that it successfully executes 
 until the last line, regardless of whether an exception occurs or not.

Power Backup Analogy: If you had a 2-minute power backup (handling mechanism), 
you could save your project and shut down normally when a power cut happens.

Handling Exceptions using try-catch
Java provides several mechanisms to handle exceptions (try-catch, throw, throws, finally).
 For predefined exceptions, we use the try-catch block.

1. The try block
Any risky code (code that has the potential to throw an exception) must be placed inside the try block.

If an exception occurs inside the try block, it throws the exception object. The code below the error
 line within the try block will not execute.

2. The catch block
The catch block catches the exception thrown by the try block.

Note: The catch block only executes if an exception is thrown. If the try block executes 
successfully without errors, the catch block is skipped.

*/

class B32 
{
    public static void main (String []args)
    {
        System.out.println("main method started");
        int a=10 , b=0,c;
        // try block risky code 
        try
        {
            c=a/b;  //c=10/0
        System.out.println(c);
        }

        // catch block  
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
        System.out.println("main method ended");
    }
}