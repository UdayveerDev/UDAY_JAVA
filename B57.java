// packages in java 
/*
What is a Package?
A package arranges a number of classes, interfaces, and sub-packages of the same type into a particular
 group.

In simple terms, a package is nothing but a folder or directory. Just as we create folders
 on our computers to store and organize related files for easy access, Java uses packages to 
 group related classes and interfaces.

Whenever we need to use the data or classes within a package, we simply import that package 
into our program.

Types of Packages
There are two main types of packages in Java:

1. Pre-defined Packages
These are built-in packages created by Java developers. You do not need to create them; 
you just import and use them.

java.lang: This is the default package in Java. It contains core classes (like data types 
and system-supported classes). You do not need to explicitly import it; the Java compiler
 imports it automatically.

java.io: Contains classes and interfaces for Input/Output operations (file handling).

java.util: Contains utility classes, such as the Scanner class used for taking user input.

java.applet, java.awt, java.net: Used for GUI, networking, and applet creation.

java.sql: Contains classes for database connectivity (like JDBC connections).

2. User-defined Packages
These are packages created by programmers for their own personal use and project organization.

Syntax: Use the package keyword followed by the package name (e.g., package myPackage;).

Access Modifiers & Their Scope in Packages
Access modifiers determine how classes and data members can be accessed across different packages.

Modifier |  Within Class |  Within Package | Outside Package (via Subclass) |   Outside Package
----------------------------------------------------------------------------------------------------
Private  |  Yes          |   No            | No                             |   No
Default  |  Yes          |   Yes           | No                             |   No
Protected|  Yes          |   Yes           | Yes                            |   No
Public   |  Yes          |   Yes           | Yes                            |   Yes


 */