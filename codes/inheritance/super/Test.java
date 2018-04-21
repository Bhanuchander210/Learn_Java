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
