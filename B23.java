// interface method 

interface client
{
    void design(); // public + abstract 
    void webdev(); // public + abstract 
}

abstract class udayTech implements client
{
    @Override 
    public void design()
    {
        System.out.println("green,top menu, three dot buttons");
    }
}

class sandeepTech extends udayTech
{
    @Override 
    public void webdev()
    {
        System.out.println("HTML,CSS,JS");
    }
}
class B23 
{
    public static void main (String []args)
    {
        sandeepTech r=new sandeepTech();
        r.design();
        r.webdev();
    }
}


