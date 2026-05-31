/*
interface A 
{
    int val; // public + static +final  | before 1.8 version
    void m(); // public + abstract      | before 1.8 version
________________________________________________________________

    default void m1()          |after 
    {                          |     coming 
        //code                 |            1.8 version
    }                          |                    of java         
    static void m2()           |
    {                          |
        //code                 |
    }                          |
________________________________________________________________
    private void ()            | after 
    {                          |    coming 
        //code                 |        1.9 version 
    }                          |                of java
              
}

*/

/*
import java.util.Scanner;
interface A 
{
    default void call()
    {
         // input the value of x and y using Scanner class 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of x: ");
        int x=sc.nextInt();
        System.out.println("enter the value of y: ");
        int y=sc.nextInt();
        add(x,y);  // calling private method add
    }
    private void add(int x,int y)   // private method inside interface 
    {
        System.out.println("addition is :"+(x+y));
    }

}
class sandeep implements A 
{
    public void sub(int x,int y)
    {
        System.out.println("subtraction is :"+(x-y));
    }
}

class B28
{
    public static void main (String args [])
{
     sandeep s=new sandeep();
     s.call();s.sub(200,100);
    
}
}
*/


//another method
import java.util.Scanner;
interface A 
{
    public static void call()
    {
         // input the value of x and y using Scanner class 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of x: ");
        int x=sc.nextInt();
        System.out.println("enter the value of y: ");
        int y=sc.nextInt();
        add(x,y);  // calling private method add
    }
    private static void add(int x,int y)   // private method inside interface 
    {
        System.out.println("addition is :"+(x+y));
    }

}
class sandeep implements A 
{
    public void sub(int x,int y)
    {
        System.out.println("subtraction is :"+(x-y));
    }
}

class B28
{
    public static void main (String args [])
{
     sandeep s=new sandeep();
     A.call();s.sub(200,100);
    
}
} 