### JAVA - GETTING STARTED

#### WHY JAVA CAME ?

###### SUCCESS OF C

- 1970-80 A powerful, efficient, structured language called *The C Programming Language* was invented and that was 
  relatively easy to learn. C quickly attracted many followers and called as **programmer's language** designed by and 
  for programmers.
  
###### NEED OF OOP

- The C is successful but **complexity**. The increasing complexity of programs has driven the need for better ways to 
  manage it.OOP is a programming methodology that helps organize complex programs through the use of inheritance, 
  encapsulation, and polymorphism. So C with OOP called as **C++**. Here the important is The invention of C++ was not 
  an attempt to create a completely new programming language. Instead, it was an enhancement to an already highly 
  successful one.
  
###### PLATFORM DIVERSITY

- The trouble with C and C++ (and most other languages) is that they are designed to be compiled for a specific target. 
  Although it is possible to compile a C++ program for just about any type of CPU, to do so requires a full C++ compiler
  targeted for that CPU. The problem is that compilers are expensive and time-consuming to create

###### EVOLUTION OF INTERNET

- The Web had not taken shape at about the same time that Java was being implemented, Java might have remained a useful 
  but obscure language for programming consumer electronics.It is a language grounded in the needs and experiences of 
  the people who devised it. Thus, Java is a programmer’s language.
 <br> 

Java was influenced by C++, it is not an enhanced version of C++. The important influence of JAVA is **C#**.

#### IMPORTANCE WITH WEB

- applet
    - A special kind of Java program that is designed to be transmitted over the Internet and automatically executed by 
      a Java-compatible web browser.
    - Two types of Objects over internet : passive information (email,etc.,) and dynamic, active programs (automatic programs).
- security
- portability
    - Comfort with any platform for internet services.
    
    
#### HOW IT WORKS ?

###### JAVA WITH BYTECODE

&nbsp;&nbsp;&nbsp;&nbsp;Bytecode is a highly optimized set of instructions designed to be executed by the Java run-time system
commonly known as **Java Virtual Machine (JVM)**. Other programming languages compiles the source code into executable for 
performance concern. JVM is a **interpreter for Byte code**. The output of the java compilation is a **Byte code**.

&nbsp;&nbsp;&nbsp;&nbsp; Now think about above discussion, A programming language need to be used in all platforms is the need.
**JVM** solves this issue with independent platform based *Run time environment* which runs the platform independent Byte
code. Now A compiled java Byte code can be executed in any platform which has the respected version of **JVM**. JAVA has
**JIT (Java In Time)** compiler which compiles some of the codes in execution time. Ya you read it correctly.. some of the
codes are compiled only in execution time. It is not practical to compile an entire Java program into executable code all
at once, because Java performs various run-time checks that can be done only at run time *[ref]*. Not all sequences of 
bytecode are compiled—only those that will benefit from compilation. The remaining code is simply interpreted. However, 
the just-in-time approach still yields a significant performance boost.

###### IN SERVER - SERVLETS

&nbsp;&nbsp;&nbsp;&nbsp;A servlet is a small program that executes on the server (commonly just say like server side JAVA).
Just feel the lines in ref *applets dynamically extend the functionality of a web browser, servlets dynamically extend 
the functionality of a web server.* Servlets are used to create dynamically generated content that is then served to the 
client. For example, an online store might use a servlet to look up the price for an item in a database. The price 
information is then used to dynamically generate a web page that is sent to the browser. Although dynamically generated 
content is available through mechanisms such as CGI (Common Gateway Interface), the servlet offers several advantages, 
including increased performance. Because servlets (like all Java programs) are compiled into bytecode and executed by the JVM, 
they are highly portable. Thus, the same servlet can be used in a variety of different server environments. 
The only requirements are that the server support the JVM and a servlet container.

###### Buzzwords

-    Robust
-    Simple
-    Secure
-    Object oriented
-    Portable
-	 Multithreaded
-	 Architecture-neutral
-	 Interpreted
-	 High performance
-	 Distributed
-	 Dynamic
<br>
To better understand how Java is robust, consider two of the main reasons for program
failure: 
- Memory management mistakes
- Mishandled exceptional conditions

1. Java virtually eliminates these problems by managing memory allocation and de-allocation for you. 
   (In fact, de-allocation is completely automatic, because Java provides garbage collection for unused objects).
   
2. Java helps in this area by providing object-oriented exception handling.

###### DISTRIBUTED

Java is designed for the distributed environment of the Internet because it handles **TCP/IP** 
protocols. In fact, accessing a resource using a URL is not much different from accessing a
file. Java also supports *Remote Method Invocation (RMI)*. This feature enables a program to
invoke methods across a network.

###### GOAL

> write once; run anywhere, any time, forever.

###### EVOLUTION

- Java 1.1 added many new library elements, redefined the way events are handled, and reconfigured many features of the 
1.0 library. It also deprecated (rendered obsolete) several features originally defined by Java 1.0.

- J2SE (Java 2 Platform Standard Edition) added support for a number of new features, such as Swing and the Collections
Framework, and it enhanced the Java Virtual Machine and various programming tools.

- 1.3 contained a smaller set of changes than the preceding three major releases, it was nevertheless important.

- J2SE 1.4 added the new keyword assert,
           chained exceptions, and a channel-based I/O subsystem. It also made changes to the
           Collections Framework and the networking classes. In addition, numerous small changes
           were made throughout. Despite the significant number of new features, version 1.4
           maintained nearly 100 percent source-code compatibility with prior versions.
           
- J2SE 5 fundamentally expanded the scope, power, and range of the language.
  1. Generics
  2. Annotations
  3. Autoboxing and auto-unboxing
  4. Enumerations
  5. Enhanced, for-each style for loop
  6. Variable-length arguments (varargs)
  7. Static import
  8. Formatted I/O
  9. Concurrency utilities
  <br><br>
  Annotations added an entirely new dimension to
  programming. In all cases, the impact of these additions went beyond their direct effects.
  They changed the very character of Java itself. it was named J2SE 5, and the developer’s kit was called JDK 5.
  which is also referred to as the developer version number. The “5” in J2SE 5 is called the product version number.
  
- Java SE 6 served to further solidify the advances made by J2SE 5.

- Java SE 7 contained many new features, including
  significant additions to the language and the API libraries. Upgrades to the Java run-time
  system that support non-Java languages were also included, but it is the language and
  library additions that were of most interest to Java programmers.
  <br>
  
  **Java SE 7** made several additions to the Java API library. Two of the most important were
  the enhancements to the *NIO Framework* and the addition of the *Fork/Join Framework*.
  
- JDK 8 represents a very significant upgrade with new language
 features: 
    1. **java.util.stream.**
    2. **java.util.function.** 
  
  <br>
The lambda expression.The inclusion of lambda expressions has also had a wide-ranging effect on the Java 
libraries, with new features being added to take advantage of them. One of the most
important is the new stream API, which is packaged in **java.util.stream**.
 
<br> 
    
 Another very important new package is **java.util.function.** It defines a number of functional interfaces,
which provide additional support for lambda expressions. Other new lambda-related features
are found throughout the API library.