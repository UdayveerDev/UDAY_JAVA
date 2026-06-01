/*
    covariance refers to the language's ability to accept a more
     specific subtype in place of a generic or broader supertype

*/

// covariant return type 
class A 
{
    A show()
    {
        System.out.println("show");
        return this;  // refers to the current object A  // this -->new A()
    }
}
class B extends A  
{
    // Overriding: the return type is  changed to class B 
    @Override
    B show()
    {
        super.show();
        System.out.println("disp");
        return this; // refers to the current object B  // this --> new B()
    }

}
class B30 
{
    public static void main (String []args)
    {
        B b=new B();
        b.show();
    }
}