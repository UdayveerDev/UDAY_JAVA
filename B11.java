//multilevel inheritance 
class A 
{
int a ;int b ;float c;
void add(){
    a=18;b=45;
    c=a+b;
    System.out.println("the sum is :"+c);
}
void sub(){
    a=200;b=100;
    c=a-b;
    System.out.println("the sub is :"+c);
}


}
class B extends A 
{
void mul(){
    a=12;b=23;
    c=a*b;
    System.out.println("the mul is :"+c);
    }
void div(){
    a=29;b=23;
    c=a/b;
    System.out.println("the div is :"+c);
}


}
class C extends B
{
    void rem(){
        a=12;b=5;
        c=a%b;
        System.out.println("the rem is :"+c);
    }

}
class B11
{
    public static void main (String []args){
        C r=new C();
        r.add();
        r.sub();
        r.mul();
        r.div();
        r.rem();
    }
}