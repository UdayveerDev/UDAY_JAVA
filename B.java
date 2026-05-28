// default constructor 
class A {
    int a;
    String name;
    boolean c;
    // void A(){        // automatically creaates default constructor in java 
    //    a=0;
    //    name =null;
    // }

    void show (){
        System.out.println(a +" "+ name + " "+ c);
    }
}
class B{
    public static void main (String []args){
        A ref =new A();
        ref.show();
    }
}
