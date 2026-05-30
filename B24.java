// multiple inheritance using interface 
/*
Why Java doesn't support Multiple Inheritance with Classes
When a single class tries to inherit from two parent classes 
(class C extends A, B), a problem arises known as the Diamond Problem (or ambiguity issue).

If both parent class A and parent class B have a method with the
 exact same name (e.g., void show()) and their own distinct method bodies,
  the Java compiler gets confused. When the subclass C calls the show() method, 
  the compiler cannot determine whether to call class A's show() or class B's show().
   Because of this ambiguity, Java completely rejects multiple inheritance 
   with classes at compile-time.

How Java achieves Multiple Inheritance using Interfaces
We can achieve multiple inheritance in Java by using interfaces instead of classes.

Syntax: class C implements A, B (where A and B are interfaces).

Why does this work without error?

Abstract Nature: Interfaces only contain abstract methods
 (methods without a body/implementation).

No Ambiguity: If Interface A and Interface B both have a method
 with the same signature (e.g., void show();), neither provides an 
 implementation. Therefore, there is no conflict about whose method body to execute.

Subclass Responsibility: The implementing subclass (class C) 
is responsible for providing the single implementation for that show() method.
 When the subclass creates an object and calls show(), the compiler knows exactly 
 which code to run—the code written in subclass C.

Shared Requirement: From a design perspective, if both interfaces require a show() method,
 providing a single implementation in the subclass successfully fulfills the requirements 
 of both interfaces simultaneously.

*/




/* this will through an error 
class A 
{
    void show ()
    {
        System.out.println("this is class A");
    }
}
class B
{
    void show ()
    {
        System.out.println("this is class B");
    }
}
class multiple extends A,B
{
    public static void main (String []args)
    {
        multiple m=new multiple();
        m.show();
    }
}

*/


// tis will executes 
/*
interface A 
{
    void show(); // public + abstract
}
interface B
{
    void show();  // public + abstract
}
class multiple implements A,B
{
   public  void show(){
        System.out.println("interface A and B");
    }
}
class B24
{
    public static void main (String []args)
    {
        multiple m=new multiple ();
        m.show();
    }
}
*/


// interface A and interface B having different methods 
interface A 
{
    void show (); // public + abstract 
}
interface B 
{
    void disp(); // public + abstract
}

class multiple implements A,B 
{
    public void show ()
    {
        System.out.println("interface A ");
    }
    public void disp () 
    {
        System.out.println("interface B ");
    }
}


class B24
{
    public static void main(String []args)
    {
        multiple m=new multiple ();
        m.show();
        m.disp();

    }
}