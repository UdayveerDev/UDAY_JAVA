// throw vs thows and try-catch

class InvalidAgeException extends Exception 
{
    InvalidAgeException (String msg)
    {
        System.out.println(msg);
    }
}

class B49
{
     public static void main (String []args)
    {
        try
        {
            vote(13);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void vote(int age) throws InvalidAgeException 
    {
         if (age <18)
         {
          throw new InvalidAgeException("Not eligible for vote");
         }

         else 
         {
            System.out.println("eligible for voting");
         }
    }
}