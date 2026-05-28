//constructor overloding
class A{
    int a;double b;String c;
    A(){
         a=100;b=45.32;c="ankit";
    }
    A(int x){
        a=x;
    }
    A(double y,String z){
        b=y;c=z;
    }
}
class B5{
    public static void main (String[] args){
        A r=new A ();
        A r1=new A(10);
        A r2=new A(23.89,"sonu");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r1.a);
        System.out.println(r2.b+" "+r2.c);

    }
}