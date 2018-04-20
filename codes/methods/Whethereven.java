import java.util.Scanner;

public class Whethereven {
    public static void main (String[] args)
    {
        boolean until = false;
        while(!until)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer:");
            int val = input.nextInt();
            if(val%2==0)
            {
                until=true;
            }
            else {
                until=false;
            }
            System.out.println ("Is "+val+"an even number?"+until);
        }

    }

}