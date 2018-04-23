import java.util.ArrayList;

class Student
{
    String name;
    double age;
    double height;
    double weight;

    public Student(String name, double age, double height, double weight)
    {
        this.name = name;       // Must refer to instance variables that have
        this.age = age;         // the same name as constructor parameters
        this.height = height;    // with the "this" keyword. Can't use
        this.weight = weight;    // Classname.variable with non-static variables
    }

}

public class Class{

    public static ArrayList<Student> register = new ArrayList<Student>();

    public static ArrayList<Student> addStudent(ArrayList register,String name,int age,int height, int weight)
    {
        Student newStudent = new Student(name, age, height, weight);
        register.add(newStudent);
        return register;
    }

    public static void showRegister()
    {
        System.out.println ("Student Details : ");
        for (Student s : register)
        {
            System.out.println ("Student Name   : "+s.name);
            System.out.println ("Student Age    : "+s.age);
            System.out.println ("Student Height : "+s.height);
            System.out.println ("Student Weight : "+s.weight);
        }
    }

    public static void main(String[] args)
    {
        addStudent(register,"Joe", 30, 70, 180);
        showRegister();

    }
}
