/*
   Feature       |      Process-Based (Multitasking)                  |  Thread-Based (Multithreading)
-----------------|----------------------------------------------------|-----------------------------------
    Scope        |-> "Occurs across multiple, different programs."    | -> Occurs within a single program.                                      
Execution        |->Multiple distinct processes execute simultaneously| -> Multiple parts (threads)of one 
                 |                                                    |   program execute simultaneously. 
Time Efficiency  |-> Does not reduce the execution time of            | -> Significantly reduces 
                 |     individual programs.                           | execution time by dividing the
                 |                                                    |      workload.
                 |                                                    |
Dependencies     |-> Programs do not share dependencies               |->Threads share the same memory
                 |          or memory space.                          |   space and resources within
                 |                                                    |    the program.

 */