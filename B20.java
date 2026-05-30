/*
What is an Abstract Method?
The word "abstract" generally means incomplete.

An abstract method is a method that is declared with the abstract modifier. 
It represents an incomplete action where the method signature is defined,
 but the implementation (the body) is left out.

Key Rules & Characteristics
Requires an Abstract Class: An abstract method can only be declared inside an 
abstract class. If a class contains even a single abstract method, the entire
 class must compulsorily be declared as abstract.

No Body: Abstract methods do not contain a body (no curly braces { }).

Ends with a Semicolon: Because they lack a body, abstract method declarations
 always end with a semicolon ;.

Must be Overridden: Any normal (concrete) subclass that extends
 an abstract class must override and implement all the abstract methods of the parent class.

Failure to Override: If a subclass fails to implement even one of the abstract methods 
from its parent class, that subclass itself becomes incomplete and must also be declared 
as an abstract class.

When to Use Abstract Methods?
The core rule for using abstract methods is:

"Whenever the action is common but implementations are different,
 then we should use an abstract method."

You use them when you know what a class should do, but you don't have
 enough specific information to define how it should be done at the parent class level.

Real-World Analogies from the Video:

The Fruit Example: If you have a parent class Fruits with a method taste(),
 you cannot write a generic body for it because every fruit tastes different.
  Instead, you make taste() abstract. Subclasses like Mango or Apple will implement
   their specific tastes (e.g., sweet).

The Vehicle Example: A parent class Vehicle might have a method wheelers().
 A generic vehicle doesn't have a specific number of wheels. By making it abstract,
  subclasses can define the exact number (e.g., a Car subclass specifies 4 wheels,
   an Auto subclass specifies 3).

   Important Notes on Object Creation
No Instantiation: You cannot create an object of an abstract class 

Reference Variables: You can create a reference variable of an abstract 
class to hold the object of its subclass. 
This allows the parent reference to call the implemented subclass method.

*/


abstract class Programming {
    public abstract void Developers ();
}

class HTML extends Programming
{
    @Override
    public void Developers()
    {
        System.out.println("Tim Berners Lee");
    }
}

class Java extends Programming
{
    @Override
    public void Developers()
    {
        System.out.println("James Gosling");
    }
}
class B20{
    public static void main(String []args){
        Programming h=new HTML();
        h.Developers();
        Programming j=new Java();
        j.Developers();
    }
}