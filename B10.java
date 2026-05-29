//multilevel inheritance 

class A   // super class 
{
int a ; double b; String c ;
void input (){
    System.out.println("enter a, b and c: ");
}
}
class B extends A  // subclass 
{
    void display(){
        a=19;b=34.34;c="uday";
        System.out.println (a+" "+b+" "+c);
    }

}
class C extends B    // subclass of B
{
void something(){
    System.out.println("something is happening.....");
}
}
class B10  // class having main method 
{
    public static void main (String []args){
        C r=new C();
        r.input();
        r.display();
        r.something();
    }
}