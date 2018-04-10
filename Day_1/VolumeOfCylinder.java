import java.util.Scanner;
import java.text.DecimalFormat;

public class VolumeOfCylinder {


    public static void main (String[] args)
    {
        double pi = 3.14160000;

        DecimalFormat df = new DecimalFormat(".########");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a cylinder :");

        double rad = input.nextDouble();

        System.out.print("Enter the radius of a cylinder :");

        double len = input.nextDouble();

        System.out.println ("The area is "+df.format(pi*rad*rad));

        System.out.println ("The volume is "+df.format(pi*rad*rad*len));

    }

}