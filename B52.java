// file -information 
import java.io.*;
class B52 
{
    public static void main (String []args){
        File f=new File("C:\\Users\\DELL\\Desktop\\demo.txt");
        
    if (f.exists())
        {
            System.out.println("file name is: "+f.getName());
            System.out.println("file location is : "+ f.getAbsolutePath());
            System.out.println("file writable : "+ f.canWrite());
            System.out.println("file readable: "+ f.canRead());
            System.out.println("file size: "+ f.length());
            System.out.println("file removed : "+ f.delete());


        }
    else 
    {
        System.out.println("file doesn't exists....");
    }
        
        
    }
}