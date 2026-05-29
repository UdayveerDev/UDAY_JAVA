/* static block in java 
Ans -> Static block is such kind 
of block in java which gets executed
at the time of loading the .class file into JVM memory
*/


class A{
    void show (){
        System.out.println("this is the show method");
    }
}
class  B extends A{
    void m1(){
        System.out.println("this is class B method");
    }
}
class C {
    public static void main (String args [] ){
        B r=new B();
        r.show();
    }
}