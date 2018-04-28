import java.util.Scanner;

/*
Write a method that finds the number of occurrences of a specified character in a string using the following header:
*/
public class Exercise {

    public static int count(String str, char a) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) 
 	        {
		        count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("The number of occurrences of \'" + ch +"\' in \"" + s + "\" is " + count(s,ch));
    }
}
