/*
What is the @Override annotation in Java?
The @Override annotation is a feature introduced in Java starting from JDK 1.5. 
It is placed right above a subclass method to instruct the compiler that the method 
s intended to override a method from its superclass.

Key Notes:

Purpose: It provides 100% clarity for both the developer and the compiler that a specific
 method is meant to be an overridden method.

Error Checking: If you apply @Override to a method that does not actually override
 a superclass method (e.g., you made a typo in the method name, changed parameters, or altered the return type), the compiler will generate an error immediately.

Readability: It improves code readability. If another developer (or even yourself months later) 
looks at the subclass, seeing the @Override tag instantly communicates that the method's 
core definition lives in a parent class, saving them from having to check the superclass file manually.

Difference from Comments: Unlike standard comments which are completely ignored by the compiler,
 the compiler actively reads the @Override annotation and performs validation checks to ensure 
 the overriding rules are successfully met.

*/

class A 
{
    void show()
    {
        System.out.println("super class");
    }
}
class B extends A  
{
    @Override
    void show()
    {
        System.out.println("subclass");
    }
}
class B29 
{
    public static void main (String []args)
    {
        B b=new B();
        b.show();
    }
}