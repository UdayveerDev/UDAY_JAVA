import java.io.*;
class B54 
{
    public static void main(String [] args)
    {
        try
        {
            FileReader r=new FileReader("C:\\Users\\DELL\\Desktop\\demo.txt");
            try
            {
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.println((char)i);
                }
            }
            finally
            {
                r.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

}