import java.util.*;
class OddNumberiBinary{

    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main (String args [])
    {
        System.out.println("Wind ranger here =======>>>>");

        Scanner sc = new Scanner(System.in);
        Integer val = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i< val; i++)
        {
            int v = sc.nextInt();
            sc.nextLine();
            String binStr = Integer.toBinaryString(v);
            int count = 0;
            for (int j=0; j< binStr.length(); j++)
            {
                for (int k=j; k < binStr.length(); k++)
                {
                    int temp = v & (int) Math.pow(2, k-j);
                    System.out.println("Curretn : "+ k + " "+ temp);
                    if (countSetBits(temp) % 2 != 0)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}