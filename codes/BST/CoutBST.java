class CoutBST{

	public static Integer fact(int a)
	{
		int total = 1;
		while (a != 1)
		{
			total *= a--;
		}
		return total;
	}

	public static Integer countBst(int a)
	{
		int top = fact(2 *a);
		int bottom = fact(a+1) * fact(a);
		return (top / bottom);
	}

	public static void main (String args [])
	{
		int a = Integer.parseInt(args[0]);
		System.out.println(" Input : " + a);
		System.out.println(" Count : " + countBst(a));
	}
}