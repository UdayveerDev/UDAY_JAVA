/*
File Handling Methods
These are the essential methods listed in the handwritten notes for managing files in Java:
canRead()
canWrite()
createNewFile()
delete()
exists()
length()
getName()
getAbsolutePath()
mkdir()
list()
read()
write()
renameTo()


What is File Handling?
File handling is the process of creating a file and managing various operations on it,
 such as reading, writing, and handling any exceptions (like checking if a file already 
 exists or handling read errors) that occur during these operations.

The java.io Package
To work with files, you must import the java.io package. It contains all the necessary classes
 required to perform Input/Output (I/O) operations in Java.

What is a Stream?
A stream is a continuous sequence of data. In Java, data is read from or written to a file 
sequentially using streams. The java.io package categorizes streams into two main types:

Byte Stream: Reads and writes data in the form of bytes. (e.g., FileInputStream, FileOutputStream)

Character Stream: Reads and writes data in the form of characters. (e.g., FileReader, FileWriter)

Basic File Operations
The video highlights four fundamental operations you will perform:

Creating a new file.

Getting information about a file.

Reading data from a file.

Writing data into an empty file.

Handling Exceptions
When performing file operations like createNewFile(), the Java compiler will warn you about
 potential IOExceptions (e.g., if the file path is invalid). You must handle these exceptions
  using one of two ways:

try-catch block: Enclose the file creation code inside a try block and catch the IOException 
in the catch block to handle it gracefully.

throws keyword: Append throws IOException to your method signature to bypass the exception 
and pass the responsibility of handling it to the method's caller.
*/



// creating a file 
import java.io.*;
class B51 
{
    public static void main (String []args){
        File f=new File("C:\\Users\\DELL\\Desktop\\demo.txt");
        try
        {
            if (f.createNewFile())
        {
            System.out.println("file successfully created.....");
        }
        else 
        {
            System.out.println("file already exists.....");
        }
        }
        catch(IOException i)
        {
            System.out.println("Exception handled...");
        }
        
    }
}