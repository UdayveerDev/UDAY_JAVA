/* Multithreading Problem Code */

/*
class Bus implements Runnable
{
    int available = 1; 
    int passenger;
    
    Bus(int passenger)
    {
        this.passenger = passenger;
    }
    
    // without synchronized keyword 
    public void run() 
    {
        String name = Thread.currentThread().getName();
        if(available >= passenger)    
        {
            System.out.println(name + " Reserved Seat..!");
            available = available - passenger;
        }
        else
        {
            System.out.println("Sorry Seat not Available..!");
        }
    }
}

class B73
{
    public static void main(String[] args) {
        
        Bus r = new Bus(1); 
        
        
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        
       
        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Raju");
        
        
        t1.start();
        t2.start();
        t3.start();
    }
}
*/


/* Multithreading Solution...! */
class Bus implements Runnable
{
    int available=3,passenger;
    Bus(int passenger)
    {
        this.passenger=passenger;  // passenger=2
    }
    public synchronized void run()// t1 or t2 or t3
    {
        String name=Thread.currentThread().getName();
        if(available>=passenger)    // 3>=1
        {
            System.out.println(name+" Reserved Seat..!");
            available=available-passenger;
        }
        else
        {
            System.out.println("Sorry Seat not Available..!");
        }
    }
}
class B73
{
    public  static void main(String[] args) {
        
        Bus r=new Bus(1);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        
       
        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Raju");
        
        
        t1.start();
        t2.start();
        t3.start();
    }
}
        