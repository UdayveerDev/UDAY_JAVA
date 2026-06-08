package uday;
/*
class ex
{
     private void show()
    {
        System.out.println("showing....");
    }

}
class B59
{
    public static void main(String []args)
    {
        ex r=new ex();
        r.show();

    }
}
*/

/* OUTPUT:-
 not getting any output because we try to get private
 access specifier from outside class 
*/


/*
class ex
{
      void show()
    {
        System.out.println("showing....");
    }

}
class B59
{
    public static void main(String []args)
    {
        ex r=new ex();
        r.show();

    }
}


OUTPUT :- showing.....
*/


/*
class ex
{
     protected void show()
    {
        System.out.println("showing....");
    }

}
class B59
{
    public static void main(String []args)
    {
        ex r=new ex();
        r.show();

    }
}

OUTPUT :- showing 
*/
