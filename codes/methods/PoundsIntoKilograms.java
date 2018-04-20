import java.util.Scanner;

public class PoundsIntoKilograms {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds :");

        double pounds = input.nextDouble();

        System.out.println (pounds+" pounds is "+(pounds*0.454)+" kilograms");


    }

}