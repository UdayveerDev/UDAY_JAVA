// finalize method in java 
/*
topic: The finalize() Method in Java
Overview
The finalize() method is a highly important concept in Java, frequently asked about in 
technical interviews. Its primary job is resource management and cleanup before an object
 is destroyed.

Key Characteristics of finalize()
Location: It is a protected method available in the Object class. Since the Object class is
 the default superclass for every class in Java, finalize() is available to all Java classes.

Default State: In the Object class, the body of the finalize() method is completely empty.
 It contains no pre-written code.

Customization: Developers are meant to override this method in their own classes to write specific
 cleanup or security-related code.

Main Purpose
The main purpose of the finalize() method is to release resources (like open files, database connections,
 network ports) that are currently held by an unused object before the Garbage Collector (GC)
  removes or destroys that object.

How it Works (The Process)
Unused Objects: When an object no longer has any reference variables pointing to it, it becomes 
an "unused object" and becomes a target for the Garbage Collector.

Resource Check: Before the Garbage Collector deletes this unused object, it checks if the object 
is still connected to external resources (e.g., a file that is still open or a database connection
 that hasn't been closed).

Calling finalize(): The Garbage Collector automatically calls the finalize() method on that object.

Deallocation: The overridden finalize() method executes the code written by the developer to safely
 close the files, disconnect the database, and deallocate resources.

Deletion: Only after the resources are successfully released does the Garbage Collector finally 
delete (clean up) the object from memory.

Interview Summary (What to say)
If asked in an interview, you can summarize it in two lines:

"The main purpose of the finalize() method is to release resources allocated by an unused object,
 right before the object is removed by the Garbage Collector."
*/
