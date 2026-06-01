/*
interface Vs. Abstract Class in Java
1. Types of Methods
Interface: Traditionally (before JDK 1.8), an interface could only contain abstract methods.
 (Note: From JDK 1.8 onwards, default and static methods with bodies are allowed,
  and JDK 1.9 introduced private methods).

Abstract Class: An abstract class can contain both abstract methods (without a body) 
and non-abstract/normal methods (with a body).

2. Multiple Inheritance
Interface: Supports multiple inheritance. You can implement multiple interfaces in a single class.

Abstract Class: Does not support multiple inheritance. A class can only extend one abstract 
class at a time.

3. Default Method Modifiers
Interface: By default, all methods inside an interface are inherently public and abstract, 
even if you don't explicitly write those keywords. You cannot use private, protected, static, 
final, or synchronized modifiers for standard abstract methods.

Abstract Class: There are no such strict restrictions. You can define methods as private,
 protected, static, or final according to your requirements.

4. Default Variable Modifiers
Interface: Any variable declared inside an interface is automatically public, static, 
and final (which means it acts as a constant). Because it is final, you must initialize the 
variable at the time of declaration. You cannot make it private or protected.

Abstract Class: Variables do not have default restrictions. They do not automatically become public,
 static, or final, and you are not forced to initialize them immediately.

5. Keywords Used
Interface: The interface keyword is used to declare an interface.

Abstract Class: The abstract keyword is used to declare an abstract class.

6. Constructors
Interface: Interfaces do not allow constructors. Why? Because constructors are used to initialize 
variables, but variables in an interface are already static and final (constants), so they cannot 
be modified or re-initialized by a constructor.

Abstract Class: Abstract classes do allow constructors. These constructors can be called when a 
child class object is created to initialize the abstract class's non-final variables.
*/