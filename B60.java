/*
| Feature        |                        Exception                                                           |                    Error                                                                            |
|----------------|--------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| Origin / Cause | Caused by our program (e.g., logical mistakes or invalid input by the programmer or user). | Not caused by our program. Occurs due to lack of system resources or environmental issues.          |
| Recoverability | Recoverable. Can be handled using try, catch, and throws blocks.                           | Not recoverable. Cannot be handled or recovered from programmatically.                              |
| Classification | Classified into both Checked and Unchecked categories.                                     | Strictly Unchecked type in Java.                                                                    |
| Responsibility | The programmer takes responsibility to anticipate and handle them.                         | It is beyond the programmer's control; the program can be 100% correct and still encounter an error.|
| Superclass     | Inherits from the Throwable class.                                                         | Inherits from the Throwable class.                                                                  |
| Common Examples| ArithmeticException, NullPointerException, IOException, InterruptedException               | OutOfMemoryError, StackOverflowError                                                                |
*/