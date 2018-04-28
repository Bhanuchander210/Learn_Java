import java.util.Scanner;

// Write a program that reads ten integers and displays them in the reverse order.


public class ArrayExercise {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");

        int[] n = new int[10];
        for (int i = 0; i < 10; i++)
	    {
		    n[i] = input.nextInt();
	    }

        for (int i = n.length - 1; i >= 1; i--)
	    {
		    System.out.print(n[i] + " ");
	    }
    }
}

