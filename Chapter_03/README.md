## Getting started programming
### Contents
- [Simple Class](#simple-class)
- [Methods](#methods)
    - [Getter and Setter](#getter-and-setter)
    - [Simple Application](#simple-application)
- [Arrays](#arrays)
    - [One Dimensional Array](#one-dimensional-array)
    - [Two Dimensional Array](#two-dimensional-array)
    
- [Inheritance](#inheri)
    -[super](#super)

### Simple class

This is the basic class format of java.

```java
class Simple {
	public static void main(String args[]) {
		
	    System.out.println("Hello This is java simple code....");
	}
}
```
Output:
```text
Hello This is java simple code....
```
Get the code : [here](/codes/simpleclass/Simple.java) 

### Methods

Implementing methods inside the class will help you achieve specific work.

To explain with Simple method,

```java
import java.util.Date;
class Simplemethod {
    public static void main(String args[]) {
        System.out.println("Hello This is java simplemethod code....");
        show_time();
    }
    public static void show_time()
    {
        System.out.println (new Date());
    }
}
```

Here a new method **show_time()** used here. But in Java some basic methods are used
to get the class objects in **JAVA Style**. 

Getter and setter are the example to view further,

##### Getter and Setter

These are just the methods to access the class variables in basic java way.

```java
class Student {
	public static String name;
	public static int id;

    public static void setName(String name) {
        Student.name = name;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public static String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static void showData()
    {
        System.out.println ("name : "+getName()+" id : "+getId());
    }

    public static void main(String args[]) {
        System.out.println("Hello This is java Getset code....");
        System.out.println("Before Set");
        showData();
        setId(1);
        setName("Naruto");
        System.out.println("After Set");
        showData();
    }

}
```

Here this simple code explains the `getter-setter`. Actually use of that defined inside the `showData()`.
The methods `getId()`,`getName()` are used outside of the class to access the class variables.

Just advancing the scenario to get a school class register is explained below.

##### One Dimensional Array

##### Two Dimensional Array


#### Inheritance

##### Super     
 
Super is just used to call the super class constructor.

See the file : [here](/codes/inheritance/super/Test.java)
      
```java
class Animal 
{ 
    public Animal(String arg) {
        System.out.println("Constructing an animal: " + arg);
    }
}
      
class Dog extends Animal 
{
    public Dog() {
        super("From Dog constructor");
        System.out.println("Constructing a dog.");
    }
}
      
public class Test 
{
    public static void main(String[] a) {
        new Dog(); 
    }
}
```

#### Output is :

```text
Constructing an animal: From Dog constructor
Constructing a dog.
```