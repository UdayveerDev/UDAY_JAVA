import java.io.*;
class B55
{
    public static void main (String args[])
    {
        File f=new File("C:\\Users\\DELL\\Desktop\\demo.txt");
        File r=new File("C:\\Users\\DELL\\Desktop\\uday.txt");
        if (f.exists())
        {
            System.out.println(f.renameTo(r));
        }

        else 
        {
            System.out.println("file doesn't exists");
        }
    }
}