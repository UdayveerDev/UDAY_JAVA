import java.lang.System;
import java.lang.String;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class B58 
{
    public static void main(String args[])
    {
        try
        {
            File r=new File("C:\\Users\\DELL\\Desktop\\uday.txt");   // this file is present on my desktop 
            Scanner sc=new Scanner(r);

            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}