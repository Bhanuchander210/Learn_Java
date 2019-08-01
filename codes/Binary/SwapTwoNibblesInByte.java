class SwapTwoNibblesInByte{
	
	public static void main (String args[])
	{
		int a = 100;
		int second = (a & 15) << 4;
		int first = (a >> 4)&15;
		System.out.println("The val is : " + (first | second));
	}
}