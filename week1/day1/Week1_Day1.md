## Steps to Create Maven Project
--------------------------------
   1. Click on the 'File' from Menu
   2. Choose 'New'
   3. Select either 'Maven Project' or 'Other'
   4. If Other -> (Expand the maven folder ) and Choose 'Maven Project'
   5. Click on the check box for Create a simple project and click on the next button
   6. Group Id is org. Name 
   7. Artifact Id is project name
   8. Click on the 'Finish' Button to create project

## Steps to Create Package
--------------------------
   1. Right click on 'src/main/java'
   2. Choose 'New'
   3. Choose 'Package'
   4. Enter the package name in lowercase
   5. Click on the 'Finish' Button.

   Note: To Create a sub folder use .(dot) [Ex: week1.day1]

## Steps to Create a class
-------------------------
   1. Right on the package (week1.day1)
   2. Choose 'New'
   3. Choose 'class'
   4. Enter the Class name in starts with Uppercase or PascalCase
   5. To create main method along with class enable the checkbox for public static void main(String[] args)
   6. Click on the 'Finish' Button.

## Steps to Execute the code
----------------------------
   Main Method is an entry point of java program
   1. Save the file (ctrl +s   or right click on the code and choose/click save)
   2. Right on the Code
   3. Choose 'run as'
   4. Click on the 'Java Application'

## Steps to view compiled code
------------------------------
   1. Right click on the 'target' folder under your project
   2. Choosee 'Show In'
   3. Choose 'System Explorer'
   4. Open the 'target' folder
   5. open the 'classess' folder
   6. Open the package folder(week1 and day1)



**Java Introduction:**

What is Java?

   Java is a computer programming language.
   Java is a versatile and widely-used programming language.
   It allows developers to write code that can run on different types of devices, from computers to mobile phones.
   Java is strong and reliable.
   Robustness in Java refers to its ability to handle errors and unexpected situations gracefully.
   It includes features like strong memory management.
   Java uses a way of organizing code based on objects.
   Object-oriented programming is a programming principle that organizes code into objects, which are instances of classes. This approach promotes code reuse, modularity, and easier maintenance.

Why Java?

   Java is known for being flexible.
   Java's adaptability means that it can be used in various scenarios.
   Whether you're building a small application or a large-scale system, Java provides the flexibility to adapt to different requirements and environments.
   Java works on different types of devices.
   Being ''platform-independent'' means that Java code can run on various devices, such as computers, smartphones, and other gadgets. This is possible because Java programs are compiled into an intermediate form (bytecode), which can be executed on any device with a Java Virtual Machine (JVM).
   Java is versatile and excels in a wide range of applications.
   It is commonly used in web development, mobile app development (Android), enterprise systems, scientific applications, and more.
   Its broad applicability makes it a popular choice for developers working on diverse projects.


**Java Architecture:**

JDK (Java Development Kit):

   JDK is like a toolkit for Java developers.
   The JDK includes everything a developer needs to write, compile, and run Java applications.
   It contains the Java compiler, libraries, and other tools to help create software.
   If you want to build Java applications, you need the JDK.

JRE (Java Runtime Environment):

   JRE is like a package to run Java programs.
   The JRE is necessary for running Java applications.
   It includes the Java Virtual Machine (JVM) and essential libraries. If you only want to run Java programs and not develop them, you just need the JRE. It allows your computer to execute Java applications.

JVM (Java Virtual Machine):

   JVM is like a virtual computer for Java.
   The JVM is a virtualized environment that runs Java bytecode.
   When you compile your Java code, it turns into bytecode, a set of instructions for the JVM.
   The JVM, in turn, translates these instructions into machine code that your computer understands.
   It makes Java programs "write once, run anywhere" by enabling them to run on any device with a compatible JVM.

IDE:
   Definition: An IDE, or Integrated Development Environment, is like a digital workspace where programmers write, edit, and manage their code. It provides tools such as a code editor, debugger, and compiler, all in one place, making it easier for developers to create and maintain their software.

Package:
   Definition: In Java, a package is a way to organize and group related classes and interfaces. It helps in avoiding naming conflicts and enhances the overall structure of a program.

Class:
   Definition: In Java, a class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that objects created from the class will have.

Variables:
   Definition: Variables in Java are like containers that store data. They have a type (int, double, String) and a name. Use variables to store and manipulate data.

Datatypes:
   Definition: Datatypes specify the type of data a variable can hold.



**Steps to execute**
-------------------
   1. Right click 
   2. RunAs ---> Java Application


**Naming Convention**
---------------------
   PascalCase - each word first letter starts with upper case (Eg : HelloWorld)
   camalCase  - first word entirely will be in lower case and form second word the first letter starts with uppercase (Eg: areYouReady)
   Project and Class name --> PascalCase
   packageName , variable name and method name --> camelCase