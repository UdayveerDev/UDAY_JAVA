/*

Interface JDK 1.8 Updates
Major Change: From JDK 1.8 onwards, interfaces in Java can contain default
 and static methods alongside abstract methods.

Before JDK 1.8: Interfaces were considered 100% abstract classes, 
meaning they could only contain abstract methods (methods without a body).

Static Methods in Interfaces
Why were they introduced? Since interfaces cannot be instantiated 
(you can't create an object of an interface), static methods are a perfect fit. 
They don't require an object to be invoked and can be called directly without 
needing to instantiate a class.

Implementation: Static methods must have a body and are implemented directly inside
 the interface itself rather than in a separate implementation class.

Key Rules & Behaviors
Direct Invocation: You call an interface's static method directly using the 
interface name (e.g., InterfaceName.methodName();).

Cannot Be Overridden: Static methods inside an interface cannot be overridden 
by any implementing classes. If an implementing class attempts to use the 
@Override annotation on the static method, the compiler will throw an error.

No Implementation Class Needed: If your interface exclusively contains static methods,
 you do not need to create an implementing class (using the implements keyword) 
 at all. You can just use the interface directly.

main Method Support: Because the main method is inherently a static method,
 you can actually declare and execute a public static void main(String[] args)
  method directly inside an interface starting from JDK 1.8.

*/


interface A 
{
    public static void show ()
    {
        System.out.println("this is the static method");
    }
}

class B27 
{
    public static void main (String []args)
    {
        A.show();
    }
}