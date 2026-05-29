/*
What is the super keyword?
Definition: The super keyword refers to the object of the superclass (parent class).

Purpose: It is used when a subclass (child class) needs to access a variable,
 method, or constructor of its superclass.

Why and When to Use super
The primary use case for super arises when there is ambiguity (confusion)
 between the superclass and subclass.

This ambiguity happens when:

A variable in the subclass has the exact same name as a variable in the superclass.

A method in the subclass has the exact same signature (name and parameters) 
as a method in the superclass (Method Overriding).

Without super, if you create an object of the subclass and call the shared name,
 Java will prioritize the subclass's own member.

To explicitly tell Java to access the superclass's version, 
you must use the super keyword. It acts as a differentiator.

The Three Uses of super
1. Accessing Superclass Variables

If Class A (Superclass) has an integer a = 10 and Class B (Subclass) also has an integer a = 20.

In Class B, simply printing a will output 20.

To access the 10 from the superclass, you write: super.a.

2. Accessing Superclass Methods

If both Class A and Class B have a method called show().

Calling show() from a Class B object will only execute Class B's version.

Inside Class B, you can call Class A's version by writing: super.show().

3. Calling Superclass Constructors

Unlike variables and methods, super() for constructors is often handled automatically
 by the Java compiler.

Default Constructors: If neither class has parameters, the Java compiler 
implicitly adds super(); as the very first line inside the subclass constructor.
 This automatically calls the superclass's constructor before executing the subclass's constructor.

Parameterized Constructors: If the superclass has a parameterized constructor 
(e.g., it takes an integer), the compiler cannot do this automatically.
 You must manually write super(value) (e.g., super(100)) as the first line 
 inside the subclass's constructor, otherwise, you will get a compilation error.
*/






/*
class A 
{
int a =10;
}

class B extends A 
{
int a=20;
void show (){
    System.out.println(a);
    System.out.println(super.a); 
}
}
class B14 {
    public static void main (String []args){
        B r=new B ();
        r.show();
    }
}

*/


/*
class A
{
    void show (){
        int a =10;
        System.out.println(a);
    }

}
class B extends A 
{
void show (){
    super.show();
    int a =20;
    System.out.println(a);
}
}
class B14
{
    public static void main (String []args) {
        B r=new B ();
        r.show();
    }
}
*/




class A
{
    A (){
        int a =10;
        System.out.println(a);
    }

}
class B extends A 
{
   B (){
    // already having super keyword automatically in default constructor 
    int a =20;
    System.out.println(a);
}
}
class B14
{
    public static void main (String []args) {
        B r=new B ();
    }
}
