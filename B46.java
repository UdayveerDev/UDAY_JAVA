/*
What is the throws Keyword?
Definition: The throws keyword is used when a programmer knows a piece of code might generate
 an exception, but they do not want to handle it themselves using a try-catch block.

Action: Instead of handling it, throws is used to declare the exception and "pass the buck" 
(bypass it) to the caller of the method to handle it.

Analogy: If you are given a task (like building a website in one day), you have two choices:

Do it yourself (This is like using try-catch).

Give the task to someone else (This is like using throws to hand the exception to the caller).
*/
class B46 
{
    public static void main(String []args) throws InterruptedException
    {
        for (int i=0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}