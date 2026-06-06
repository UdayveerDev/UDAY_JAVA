// write on a file 
import java.io.*;
class B53
{
    public static void main(String []args)
    {
    try
    {
    
        FileWriter f=new FileWriter("C:\\Users\\DELL\\Desktop\\LC.txt");
        try
        {
            f.write("java is the best language...");
        }
        finally 
        {
            f.close();
        }
        System.out.println("data successfully written in file...");
    }

    catch(IOException i)
    {
        System.out.println(i);

    }

 }
}
