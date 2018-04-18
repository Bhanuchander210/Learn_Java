### JAVA-OOP
<hr>

#### Object-Oriented Programming

Object-oriented programming (OOP) is at the core of Java. In fact, all Java programs are to
at least some extent object-oriented. OOP is so integral to Java that it is best to understand
its basic principles before you begin writing even simple Java programs.

<hr>

##### Why OOP needed ?

Some programs are written around *“what is happening”* and others are written around *“who is being affected.”*
The first way is called the **process-oriented model.** This approach characterizes a program as a series of linear 
steps (that is, code). The process-oriented model can be thought of as code acting on
data. Procedural languages such as C employ this model to considerable success. However,
as mentioned in Chapter 1, problems with this approach appear as programs grow larger
and more complex.
To manage increasing complexity, the second approach, called **object-oriented programming**, was conceived. 
Object-oriented programming organizes a program around its data (that is, objects) and a set of well-defined interfaces 
to that data. An object-oriented program can be characterized as data controlling access to code.

<hr>

##### Abstraction

An essential element of object-oriented programming is **abstraction**.

> Example : 
  This abstraction allows people to use a car to drive to the grocery store
  without being overwhelmed by the complexity of the parts that form the car. They can
  ignore the details of how the engine, transmission, and braking systems work. Instead,
  they are free to utilize the object as a whole.
  
Object-oriented concepts form the heart of Java just as they form the basis for human
understanding. It is important that you understand how these concepts translate into
programs.

<hr>

#### OOP PRINCIPLES
- [Encapsulation](#encapsulation)
- [Inheritance](#inheritance)
- [Polymorphism](#polymorphism)

<hr>

##### ENCAPSULATION

Encapsulation is the mechanism that binds together code and the data it manipulates, and
keeps both safe from outside interference and misuse. It prevents the code and data from 
being arbitrarily accessed by other code defined outside the wrapper.

> **Example:** shifting gears does not turn on the headlights!<br>
Because an automatic transmission is encapsulated, dozens
of car manufacturers can implement one in any way they please. However, from the driver’s
point of view, they all work the same.

<br>

In Java, the basis of encapsulation is the **class.** <br>

The **public interface** of a class represents everything that external users of the class need to know, or may know. The private methods and data
can only be accessed by code that is a member of the class. Therefore, any other code that
is not a member of the class cannot access a **private method** or variable. Since the private
members of a class may only be accessed by other parts of your program through the class’
public methods, you can ensure that no improper actions take place. Of course, this means
that the public interface should be carefully designed not to expose too much of the inner
workings of a class

<hr>

##### INHERITANCE

Inheritance is the process by which one object acquires the properties of another object. This
is important because it supports the concept of hierarchical classification.

> Example: A Golden Retriever is part of the classification dog, which in turn is part of the
 mammal class, which is under the larger class animal.
 
Without this you cannot make the hierarchy. If you fails to make hierarchy, just think what will happen next. Again it
will fall on complexity because of the each and every explicit classes. you cannot connect **animal -> mammal -> dog.**
So the construction held like **superclass** (animal) and **subclass** (mammal).

<hr>

##### POLYMORPHISM 

<a align="center"><i>"one interface, multiple methods.”</i><a>

Polymorphism is a feature that allows one interface to be used for a general class of actions.

> Example: Extending the dog analogy, a dog’s sense of smell is polymorphic. If the dog smells a
           cat, it will bark and run after it. If the dog smells its food, it will salivate and run to its bowl.
           The same sense of smell is at work in both situations. The difference is what is being smelled,
           that is, the type of data being operated upon by the dog’s nose! This same general concept
           can be implemented in Java as it applies to methods within a Java program.
           
<hr>
           
#### A Simple Program

```java
/*
This is a simple Java program.
Call this file "Example.java".
*/
class Example {
// Your program begins with a call to main().
public static void main(String args[]) {
    System.out.println("This is a simple Java program.");
}
}
```
<br>

<p>Here, We know some thing about this code</p>

- *Multiline comment*

```java
/*
This is a simple Java program.
Call this file "Example.java".
*/
```

- *class Identifier*

```
class Example {
```

Here *Example* is the class identifier. These are always implemented with camelcase for **convention**.

- *Single-line comment*

```java
// Your program begins with a call to main().
```

- *Access Modifier*

```
public static void main(String args[ ]) {}
```
<br>

The public keyword is an **access modifier**, which allows the programmer to control the visibility of class members.

<hr>

```text
            | Class | Package | Subclass | Subclass | World
            |       |         |(same pkg)|(diff pkg)| 
————————————+———————+—————————+——————————+——————————+————————
public      |   +   |    +    |    +     |     +    |   +     
————————————+———————+—————————+——————————+——————————+————————
protected   |   +   |    +    |    +     |     +    |         
————————————+———————+—————————+——————————+——————————+————————
no modifier |   +   |    +    |    +     |          |    
————————————+———————+—————————+——————————+——————————+————————
private     |   +   |         |          |          |    

+ : accessible
blank : not accessible 
```
<hr>