// Number format exception
class B34
{
    public static void main(String []args)
    {
        String str="uday";
    
        try
        {
            int a = Integer.parseInt(str);
        System.out.println(a);
        System.out.println("String NumberFormatException");

        }
        catch (NumberFormatException e)
        {
              System.out.println("String "+str+ " can't be converted to Integer");
        }

            System.out.println("Main method ended");
      
    }
}