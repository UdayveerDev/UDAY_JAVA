import java.io.*;
class B56
{
    public static void main (String [] args) throws IOException 
    {
        FileInputStream r =new FileInputStream("C:\\Users\\DELL\\Desktop\\uday.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\DELL\\Desktop\\veer.txt");

        int i;
        while((i=r.read())!=-1)
        {
            w.write((char)i);
        }
        System.out.println("Data copied successfully.......");
    }
}