/*
 * Why Java :
   1) because java is a Platform independent language , we can share java file without thinking about the Operating System of ther client;
   2) Java is Object Oriented Programming language that deals with Objects and classes , also market needs OOPs in their Resequites;
   3) Java is secure , as it is a platfrom independent language we not share source code we only share ByteCode or (.class) file 
   4)Java is Robust language ,  it is strictly typed language 
   5)Java Support Multithreading , ability to do multiple work at a time as threads
   6) Easy to learn and also readable language , Java is a user friendly language ;
 */

 /*
  * Lets talk about How java is Platform independent :
  1) Java runs on a vertual Machine Called JVM(JAVA VERTUAL MACHINE)
  2) Javac is the java-compiler that compile java source code to (.class) file Or ByteCode;
  3) afte that JIT compile that .class bytecode file to the Operating System's executable file , example : for windows(.exe)

              *----- Diagram to explain ------*
             +-------------------------+
           |       Java Code         |          (Source Code)
           |     (HelloWorld.java)   |
           +-------------------------+
                       |
                       |   (Compilation by javac)
                       v
           +-------------------------+
           |       Bytecode          |          (Platform Independent)
           |     (HelloWorld.class)  |
           +-------------------------+
                       |
                       |   (Execution by JVM)
                       v
        +------------------------------------+
        |         Java Virtual Machine       |
        |    (With Just-In-Time Compiler)    |
        +------------------------------------+
                       |
           +-------------------------+
           |  Interpreted Code &     |           (Optimized Execution)
           |  JIT-Compiled Machine Code|
           +-------------------------+
                       |
                       v
               +----------------+
               | Operating System| 
               +----------------+

  */

  //let's write the HelloWorld Program in java : 


public class BasicsIntroduction {  //first ve have to make a class 

    public static void main(String args[]) {
        System.out.println("Hello, World !");
    }
    
}
 /* 
public static void main(String args[]) {}

// Explanation:
- public: The method is accessible from anywhere.
- static: The method can be run without creating an instance of the class.
- void: The method does not return any value.
- main: The entry point for the program where execution begins.
- String: The type of data for `args`, which can only contain text.
- args[]: An array of `String` used for command-line arguments.
 */

