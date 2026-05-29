//hierarchical inheritance

    class students  //parent class or super class
    {
        int roll ;String  name ; int marks ;
        void m1(){
            System.out.println("enter roll name and marks :"); 
        }
        
    }

    class uday extends students     // subclass 
    {
        void display(){
            roll=31;name ="udayveer singh";marks=92;
            System.out.println(roll+" "+name+" "+marks);
        }
    }
    class sandeep extends students    // subclass 
    {
        void display(){
            roll =30;name ="sandeep pathak";marks= 57;
            System.out.println(roll+" "+name+" "+marks);
        }
    }

    class B13 {
        public static void main (String [] args ){
            students r=new students ();
            r.m1();
            uday r1=new uday();
            r1.display();
            sandeep r2 =new sandeep();
            r2.display();
        }
    }