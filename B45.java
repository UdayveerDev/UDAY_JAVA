/*
What is the throw Keyword?
Definition: The throw keyword is used to explicitly throw a user-defined or 
customized exception object to the Java Virtual Machine (JVM).

Purpose: It gives developers the power to decide when an exception should occur 
and what kind of exception object should be passed to the JVM, 
rather than relying solely on the JVM's internal, implicit exception generation.
*/


import java.util.Scanner;
class B45
{

     public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


    public static void main (String abc[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age: ");
        int age =sc.nextInt();

        if (age <18){
            throw new InvalidAgeException("can't eligible for vote");
        }
        else 
        {
            System.out.println("you can vote");
        }
    }
   

}