// extending interface 
interface rahul
{
    void add();  // public + abstract
}
interface sandeep extends rahul
{
    void sub(); // public + abstract
}


class uday implements sandeep
{
    @Override
    public void add()
    {
        System.out.println("adding....");
    }

    @Override
    public void sub()
    {
        System.out.println("subtracting....");
    }
}

class B25
{
    public static void main(String []args)
    {
        uday r =new uday();
        r.add();
        r.sub();
    }
}

