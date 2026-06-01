/*
Exception Hierarchy in Java
Throwable Class: The Throwable class is the superclass or root class of the Java exception hierarchy.

Subclasses of Throwable: The Throwable class has two main subclasses:

Exception

Error

Exception vs. Error
Exception:

Occurs due to mistakes made by the programmer in the program logic.

If no mistakes are made, exceptions will not occur.

Handleable: Exceptions can be handled using exception handling mechanisms (like try-catch).

Error:

Occurs even when the programmer has made zero mistakes.

Caused by environmental issues or JVM problems (e.g., lack of memory).

Not Handleable: The programmer cannot handle or recover from these errors; they just happen.

Examples: StackOverflowError (stack memory exhausted), OutOfMemoryError (JVM memory exhausted),
 Linkage Errors (e.g., verification failures during compilation/linking).

Types of Exceptions
Exceptions are broadly categorized into two types based on when they occur:

Runtime Exceptions (Unchecked Exceptions):

Occur during the execution (runtime) of the program.

Examples: ArithmeticException, NullPointerException, NumberFormatException, IndexOutOfBoundsException
 (which includes ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException).

Compile-time Exceptions (Checked Exceptions):

Checked by the compiler during compilation.

Examples: IOException, SQLException, ClassNotFoundException.

Program Execution Flow & Exceptions/Errors
Source Code: Developer writes code in a .java file.

Compilation (javac): The compiler converts the source code to bytecode (.class file).

If there are syntax errors or missing classes, the compiler throws a Compile-time Error.

Execution (java / JVM): The JVM (Java Virtual Machine) interprets and runs the bytecode.

If a logic issue occurs here (e.g., dividing by zero), the JVM throws an Exception (specifically,
 a Runtime Exception).

If a system resource issue occurs (e.g., out of memory), the JVM throws an Error.

Exception Handling Mechanisms
Java provides mechanisms to handle exceptions so the program doesn't terminate abruptly:

try-catch: Used for handling predefined exceptions. The programmer takes responsibility for 
catching and handling the exception.

throw / throws: Used when the programmer wants to create custom (user-defined) exception objects
 or wants to pass the responsibility of handling the exception to the JVM or caller method.

finally: A block that guarantees execution (100% of the time) regardless of whether an exception 
occurred or not.

Deep Dive: NullPointerException
A NullPointerException occurs when a program attempts to perform an operation on a null reference 
as if it were a valid object.

null is a reserved keyword in Java representing a literal value. It is not a class or an object itself,
 and it has no properties or methods.
*/

// NullPointer Exception 

class B33 
{
    public static void main (String []args)
    {
        String str=null;
        System.out.println("before try block");
        try
        {
            System.out.println(str.toUpperCase());
        }

        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("after catch block");
        
        
    }
}
