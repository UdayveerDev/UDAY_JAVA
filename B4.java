/* 
 Private Constructor

Q. What is private constructor?
Ans -> In Java, it is possible to write 
a constructor as private but according to the rule
 we can't access private members outside of class.

Syntax :-
class class_name
{
    private class_name() // private constructor
    {
        // block of code
    }
}

*/


// this code will run 
/*
class B4 {
    int a;double b;String c;
    private B4()
    {
        a=10;b=30.56;c="harshit";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String []args){
        B4 r=new B4();
    }
}
*/


//this code will not run because private constructor can not be instantiated outside the class 
class A{
    int a;double b; String c;
    private A(){
        a=10;b=19.89;c="nawya";
        System.out.println(a+" "+b+" "+c);
    }
}
class B4 {
    public static void main (String [] args ){
        A r=new A();
    }
}