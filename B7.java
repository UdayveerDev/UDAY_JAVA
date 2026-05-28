// instance block in java 
/*
Q. What is instance block? With example.

Ans ➔ Instance block is similar to a method which has no name,
it can be written inside a class only but not inside a method.
Note:-
It is always executed before the Constructor.

We can use variables only inside the instance block, not methods.

We write time-consuming code inside an instance block, like - JDBC Connectivity.
 (This is because it executes just before the constructor,
 so tasks like establishing a database connection are ready 
 before the object is fully initialized).
 */


//syntax
/* 
class A{
    {
        // lines of code
    }
}
*/
class B7{
    B7(){
        System.out.println("this is the default constructor");
    }

    { 
        System.out.println("this is the instance");
    }
    
    public static void main (String [] args){
        B7 r=new B7();
    }
    
}

