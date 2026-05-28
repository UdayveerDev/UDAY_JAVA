// parameterized constructor 
class A{
    int x,y;
    A(int a,int b) // parameterized constructor 
    {
        x=a;y=b;
    }
    void show (){
        System.out.println(x+" "+y);
    }
}
class B2 {
    public static void main (String []args){
        A r=new A(100,200);
        r.show();
    }
}