class SumAtKLevel
{
	public static void main (String args[])
	{
		String bst = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";

		int k = 2;
		int current = -1;
		int total =0;

		for (int i = 0; i< bst.length() ; i++)
		{
			if (bst.charAt(i)=='(')
				current ++;
			else if (bst.charAt(i)==')')
				current--;
			else if (current == 2)
				total += Character.getNumericValue(bst.charAt(i));
		}

		System.out.println("total : "+ total);
	}
}