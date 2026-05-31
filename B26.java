/*


### **Java Interfaces: Before JDK 1.8**

* **Rule:** Before Java 1.8, an interface could **only** contain abstract methods.
* **Default modifiers:** Any method declared inside an interface was implicitly 
`public` and `abstract` by default.
* **Implementation:** Any class implementing an interface was strictly forced 
to override/implement *all* the methods present in that interface.
* **The Problem:** If a Java developer wanted to add a new method to an 
existing interface (e.g., updating a software version), **every single 
class** implementing that interface would break. They would all be forced
 to implement the new method, or else they would throw compilation errors 
 and become abstract classes. This was a nightmare for maintaining large-scale codebases.

---

### **Java Interfaces: From JDK 1.8 Onwards**

To solve the backward compatibility problem, Java 1.8 introduced **Default Methods** 
and **Static Methods** inside interfaces.

* *Note:* Because of this change, an interface is no longer considered a 
"100% pure abstract class".

#### **What is a Default Method?**

A default method is a method defined inside an interface with the 
`default` keyword that **has a body (implementation)**.

**Syntax Example:**

```java
interface A {
    void a1(); // regular abstract method (implicitly public & abstract)
    void a2(); // regular abstract method
    
    // JDK 1.8 Default Method
    default void a3() {
        System.out.println("This is a default method implementation.");
    }
}

```

### **Key Advantages of Default Methods**

1. **Backward Compatibility:** You can add a new method to an interface without breaking 
the existing classes that implement it.
2. **Optional Overriding:** Implementing classes are **not forced** to override a 
`default` method.
* If a subclass *does not* override it, it simply inherits the default implementation
 provided in the interface.
* If a subclass *does* override it (using the `public` modifier), the subclass's 
specific implementation will be executed instead of the interface's default one.



### **How it Works (Code Flow from the Video)**

* **Scenario:** Interface `A` has methods `a1()` and `a2()`. Classes `B`, `C`, 
and `D` implement interface `A` and override `a1()` and `a2()`.
* **Update:** The developer adds `default void a3() { ... }` to Interface `A`.
* **Result:** * Classes `B`, `C`, and `D` **do not get compilation errors**.
* If Class `C` and `D` call `a3()`, they will use the code written inside the interface.
* If Class `B` decides to override `a3()` with its own logic, calling `a3()` from
 a Class `B` object will run Class `B`'s specific code, ignoring the default interface code.


*/

interface A 
{
    void a1(); //public + abstract
    void a2(); // public + abstract


    // after jdk 1.8 default method 
    default void a3 ()
    {
        System.out.println("this is the method a3");
    }
}

class uday implements A 
{
    public void a1()
    {
        System.out.println("this is the method a1");
    }

    public void a2()
    {
        System.out.println("this is the method a2");
    }
}

class B26
{
    public static void main (String []args)
    {
        uday r= new uday();
        r.a1();
        r.a2();
        r.a3();
       
    }
}

