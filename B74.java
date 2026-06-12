/*
1. Introduction to Synchronization
What is Synchronization? Synchronization is a technique used in multithreading to 
control access to a shared resource by multiple threads.
Purpose: The main purpose of synchronization is to overcome the problem of data inconsistency
 or "corrupt data" in multithreading.

The Problem it Solves: When multiple threads try to access the same shared resource at the exact
 same time, it can provide wrong results or corrupt data. Synchronization ensures that only one 
 thread can access the resource at a specific time.

2. The Bank Account Analogy
Imagine a joint bank account shared by three people (Thread 1, Thread 2, and Thread 3),
 containing a total balance of ₹500.

Without Synchronization: If all three members go to the bank and try to withdraw ₹500 at
 the exact same time, multithreading might process all three requests concurrently, 
 resulting in ₹1500 being withdrawn from a ₹500 account. This is corrupt data.

With Synchronization: If the transaction process is synchronized, only one person (thread)
 can enter the process at a time. The first person withdraws the ₹500. When the second or 
 third person attempts the withdrawal, the system will correctly show insufficient balance, 
 preventing incorrect results.

3. Types of Synchronization in Java
Synchronization in Java is broadly classified into two categories:

A. Method-Level Synchronization
How it works: You use the synchronized keyword directly on the method declaration 
(e.g., public synchronized void run()).

Execution: When a method is synchronized, it locks the entire method. If T1, T2,
 and T3 want to access this method, only one thread (e.g., T3) will enter the "synchronized area"
  at a time.

Waiting: The other threads (T1 and T2) must wait outside the method completely until
 the first thread finishes executing and releases the resource.

B. Block-Level Synchronization
How it works: Instead of locking the entire method, you put only a specific block of
 code inside a synchronized (this) { ... } block.

Execution: Threads can enter the method simultaneously and execute any code outside
 the synchronized block (e.g., non-critical, time-consuming initialization tasks).

Waiting: The threads will only wait when they reach the specific synchronized block. 
Only one thread can enter this block at a time to access the critical shared resource.

Advantage: Block-level synchronization is generally faster and more efficient than
 method-level synchronization because it reduces the waiting time. Threads can process 
 the non-critical parts of the method in parallel rather than waiting outside the method entirely.
*/