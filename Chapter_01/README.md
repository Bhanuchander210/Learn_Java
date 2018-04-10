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

### IMPORTANCE WITH WEB

- applet
    - A special kind of Java program that is designed to be transmitted over the Internet and automatically executed by 
      a Java-compatible web browser.
    - Two types of Objects over internet : passive information (email,etc.,) and dynamic, active programs (automatic programs).
- security
- portability
    - Comfort with any platform for internet services.
    
    
### HOW IT WORKS ?

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