import java.util.ArrayList;

class Animal
{
    String name;
    Integer age;

    public Animal(String name, Integer age)
    {
        this.name = name;       
        this.age = age;       
    }

}

public class Animals{

    public static ArrayList<Animal> register = new ArrayList<Animal>();

    public static void addAnimal(String name, Integer age)
    {
        Animal newAni = new Animal(name, age);
        register.add(newAni);
    }

    public static void showRegister()
    {
        System.out.println ("Animals Details : ");
        System.out.println ("--------------------------");
        for (Animal s : register)
        {
            System.out.println ("Animal Name    : "+s.name);
            System.out.println ("Animal Age     : "+s.age);
	    System.out.println ("--------------------------");
        }
    }

    public static void main(String[] args)
    {
        addAnimal ("Richard Parker", 17);
	addAnimal ("Wolverine", 50);
        showRegister();

    }
}
