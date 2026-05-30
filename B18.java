/*
What is Abstraction?
Definition: Abstraction is a core Object-Oriented Programming (OOPs) concept.
 It is the process of hiding implementation details from the user and only highlighting 
 and providing the set of services they need.

Real-World Software Analogy: Imagine a calculator software.

The user sees buttons for services like addition, subtraction,
 multiplication, and division.

When the user clicks the "Add" button, they get the result.

However, the user does not see the back-end code 
(whether it's written in Java, Python, or another language) 
that executes the addition. The complex logic is hidden,
 and only the required functionality is exposed.

Advantages of Abstraction
Security: Because the internal implementation details and raw code 
are hidden from the user, the software is much more secure.

Enhancement (Flexibility): Abstraction allows developers to 
change the background code without affecting the user interface.
 For example, if a background process written in Java is too slow, 
 a developer can replace that specific logic with faster Python code.
  The end-user will only notice the improved speed, as the interface 
  and buttons they interact with remain exactly the same.

How to Achieve Abstraction in Java
Java provides two ways to achieve abstraction:

Abstract Classes (0-100% Abstraction): Use abstract classes when
 you know some of the implementation but not all of it. For example,
  if you can write 20% of the code but need another developer or subclass
   to complete the remaining 80%, you use an abstract class.

Interfaces (100% Abstraction): Use interfaces when the client
 only provides a list of requirements (services), but has no 
 knowledge of the implementation. The developer is responsible
  for 100% of the logic and coding.
*/
abstract class Animal
{

}
class Dog extends Animal
{

}
class B18{
  public static void main (String []args){
    Animal r=new Dog();
  }
}

