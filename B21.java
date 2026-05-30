/*
What is an Interface?
An interface is just like a class, but it only contains abstract methods.

It can be defined as a collection of abstract methods.
 You cannot have normal (concrete) methods with a body inside an interface.

To use an interface in Java,
 a class must use the implements keyword.

Key Rules & Characteristics of Interfaces
Methods are public and abstract by default:

Any method you declare inside an interface 
(e.g., void m1();) is automatically treated by the compiler
 as public abstract void m1();. You don't explicitly need to write public abstract.

Variables are public, static, and final by default:

Any variable declared inside an interface (e.g., int a;)
 is automatically public static final. This means it acts 
 as a constant, and its value cannot be changed.

Methods Must Be Overridden:

When a class implements an interface, it must override and provide the
 implementation for all the abstract methods of that interface.
  If it fails to do so, the implementing class itself becomes an abstract class.

Important Rule: When overriding the interface method in the subclass,
 you must use the public access modifier. This is because the method
  in the interface is public, and you cannot assign a weaker access
   privilege (like default or private) when overriding.

Why and When to Use an Interface? (The Real-World Use Case)
The most important reason to use an interface is that it deals with
 the contract between a Client and a Developer.

The Client-Developer Analogy:

The Requirement: A client (who doesn't know programming) goes to a developer
 and asks for a specific software tool (e.g., "I want a software that takes
  an input and gives an output").

The Interface (Contract): The developer listens to the client and immediately
 creates an Interface representing these exact requirements.

Example: The developer creates an interface Client with two methods: 
void input(); and void output();. The interface strictly notes down the 
requirements without any actual coding logic.

The Implementation: The developer then goes away, creates a class
 (e.g., class Raju implements Client), and writes the actual backend 
 code to make input() and output() work.

Security & Hiding Data: When the software is ready,
 the developer gives the client the executable software (GUI/Setup), 
 not the source code. The client interacts with the inputs and outputs, 
 but the complex backend code is completely hidden.

This is why interface variables are final—the developer cannot change
 the core requirements that the client asked for.

*/

import java.util.Scanner;
interface client 
{
    void input(); // public + abstract
    void output(); //public + abstract
}
class Raju implements client
{
    String name;double Sal;
    public void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name :");
        name =sc.nextLine();

        System.out.println("enter salary :");
        Sal =sc.nextDouble();
    } 
   public  void output()
    {
        System.out.println("name of employee is :"+name+" "+"and salary is :"+Sal);
    }
}
class B21{
public static void main (String []args){
    client r=new Raju();
    r.input();
    r.output();
 }
}
