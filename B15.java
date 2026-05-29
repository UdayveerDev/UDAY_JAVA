/*
What is the this Keyword?
Definition: The this keyword refers to the current object of a class.
 It is a reference variable that points to the object currently 
 invoking a method or constructor.

Mechanism: When you create an object (e.g., A r = new A();),
 a unique reference ID is generated for that object in memory.
  The reference variable (r) holds this ID. The this keyword
   intrinsically holds that exact same unique reference ID,
    proving that it acts as a stand-in for the current object itself.

Four Main Uses of the this Keyword
1. Differentiating Between Instance and Local Variables

The Problem: If you have an instance variable 
(e.g., int a; declared in the class) and
 a local variable (e.g., int a; passed as a 
 parameter in a constructor or method) with 
 the exact same name, the Java Runtime Environment (JRE) gets confused.
  If you write a = a;, the JRE assumes you are only referring to the 
  local variable, and the instance variable remains at its default value (like 0).

The Solution: By writing this.a = a;, you explicitly tell the compiler that this.
a is the instance variable (since this refers to the object) 
and the right-hand a is the local variable.

2. Proving it Refers to the Current Object

You can prove that this points to the current object by printing out 
an object's reference variable (e.g., System.out.println(r);) 
and then printing the this keyword inside a method of that class 
(System.out.println(this);). Both will output the exact same 
unique reference ID in the console.

3. Calling a Default Constructor from a Parameterized Constructor

You can use this() to invoke a default (no-argument) constructor
 of the same class from inside a parameterized constructor.

Syntax: You must write this(); as the very first line inside
 the parameterized constructor. This is useful for reusing
  code or initialization logic present in the default constructor.

4. Calling a Parameterized Constructor from a Default Constructor

Conversely, you can use this() to call a parameterized constructor 
from inside a default constructor.

Syntax: By writing this(10); (passing an argument) as the first 
line inside the default constructor, Java will automatically route
 the call to the corresponding parameterized constructor in the same class wi
 thout needing to create a seperate object for it.
*/



/*  IT CHECKS HOW THIS AND R IS SAME 
class B15
{
    void show (){
        System.out.println(this);
    }
public static void main(String []args){
    B15 r=new B15();
    System.out.println(r);
    r.show();
}
}

*/

/*
class B15
{
    int a ;
    B15(int a){
        this.a=a; // this.a is instance variable 
    }
    void show (){
        System.out.println(a);
    }
    public static void main (String []args ){
        B15 r=new B15(100);
        r.show();
    }
}
*/


// CALLING DEFAULT CONSTRUCTOR USING THIS KEYWORD 
/*
class B15{
    B15(){
        System.out.println("hello everyone");
    }
    B15(int a){
        this();
        System.out.println(a);

    }
    public static void main (String []args){
        B15 r=new B15 (100);
        
    }
}
*/




// CALLING PARAMETERIZED CONSTRUCTOR USING THIS KEYWORD 
class B15 {
    B15(){
        this(10);

    }
    B15(int a){
        System.out.println(a);
    }
    public static void main (String args []){
        B15 r=new B15();
    }
}