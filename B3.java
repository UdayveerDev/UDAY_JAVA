// copy constructor 
class A{
    int a ;String b;
    A(){
        a=10;b="uday";
        System.out.println(a+" "+b);
    }
    // copy constructor 
    A(A ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}

class B3 {
    public static void main (String []args){
        A r =new A();
        A r2=new A(r);  // copy value of r into r2       
    }
}
