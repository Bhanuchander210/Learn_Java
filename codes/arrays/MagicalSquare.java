import java.util.*;
class MagicalSquare{

    static int doCalculate(String num)
    {
        int total = 0;
        boolean flag = false;
        int length = num.length();
        while(length > 0)
        {
            int val = Integer.parseInt(num.substring(length-1, length));
            if (flag) {
                flag = false;
                val = val * 2;
                if (val > 9)
                {
                    val = (val%10)+1;
                }
            }else{
                flag=true;
            }
            total += val;
            length--;
        }
        return total;
    }

    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Integer val = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i< val; i++)
        {
            String binStr = sc.nextLine();
            int count = 0;
            for (int j=0; j < binStr.length() ; j++)
            {
                for (int k=j; k < binStr.length(); k++)
                {
                    String temp = binStr.substring(j, k+1);
                    if ( doCalculate(temp) % 10 == 0)
                        count ++;
                }
            }
            System.out.println(count);
        }
    }
}