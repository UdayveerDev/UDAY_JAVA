//simple inheritance 
/*
class A {
    int a ;int b;
    void show(){
        a=10;b=89;
        System.out.println(a+" "+b);
    }
}
class B extends A {
    int c;int d;
    void show1 (){
        c=90;d=78;
        System.out.println(a+" "+b+" "+c+" "+d);
    } 
}
class B9 {
    public static void main(String []args){
        B r=new B();
        r.show();
        r.show1();
    }
}
*/
class student {
    int marks ;String name ;
    int roll ;
    void input(){
        System.out.println("enter roll name and marks: ");
    }
}

class uday extends student {
    
    void show (){
        roll=41;name ="uday";marks =93;
        System.out.println(roll+" "+name+" "+marks);
    }
}

class B9{
    public static void main (String []args){
        uday r=new uday();
        r.input();
        r.show();
    }
}
