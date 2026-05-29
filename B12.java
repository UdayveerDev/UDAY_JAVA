/*
Why Java Doesn't Support Multiple Inheritance
The Diamond Problem: The core reason Java doesn't support
 multiple inheritance using classes is because of the potential for confusion and ambiguity.

The Scenario: Imagine you have two separate superclasses (parent classes), 
let's say Class A and Class B. Both of these classes contain a method with the exact same name, 
for example, a show() method.

The Conflict: If a single sub-class (child class) tries to extend both Class A and Class B,
 the Java compiler runs into a major issue. When the sub-class calls the show() method,
  the compiler cannot determine which version of the method to execute—the 
  one from Class A or the one from Class B.

Memory Duplication: This confusion leads to what is known as a memory duplication issue,
 where the sub-class doesn't know which inherited property to prioritize.

The Resolution: To avoid this ambiguity entirely, Java's creators decided to prohibit multiple inheritance through classes.

How Java Handles Multiple Inheritance
Interfaces: While Java does not support multiple inheritance with regular classes, it does support it through the use of Interfaces. When implementing multiple interfaces, the ambiguity is resolved because interfaces only provide method signatures,
 not the actual implementation block. The implementing class provides the single implementation.
*/

// this will give you an error
class A
 {
 void m1 (){
    System.out.println("this is m1 of class A");
 }
}
class B
{
void m1 (){
    System.out.println("this is m1 of class B");
}
}
class C extends A,B {
void m2 (){
    System.out.println("this is the m2 of class C");
}
class B12 {
    public static void main (String []args){
        C r=new C();
        r.m1();
    }
}
