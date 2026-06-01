/*var-arg method:-
Introduced in JDK 1.5, Var-args (Variable Arguments) 
is a feature that allows a single Java method to accept zero 
or multiple arguments of the same data type.
*/
class A 
{
    void add(int...a) //var-args method 
    {
        int sum=0;
        for (int x:a)
        {
            sum=sum+x;
        }
        System.out.println("the sum of numbers : "+sum);
    }

}

class B31
{
    public static void main(String []args)
    {
        A r=new A();
        r.add(); r.add(10);r.add(10,20,30,40);
    }
}