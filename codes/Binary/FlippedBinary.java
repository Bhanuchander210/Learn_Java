import java.util.*;

class FlippedBinary{

	public static String getBin (Integer a)
	{
		return Integer.toBinaryString(a);
	}

	public static int countSetBits(int n) 
    { 
        int count = 0; 
        while (n != 0) { 
            count += n & 1; 
            n = n >> 1; 
        } 
        return count; 
    } 

	public static void main (String args [])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a and b: ");
		Integer a = scanner.nextInt();
		scanner.nextLine();
		Integer b = scanner.nextInt();
		scanner.nextLine();
		Integer or = a ^ b;
		System.out.println("a and b are : " + countSetBits(or));
	}
}