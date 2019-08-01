class NoOfFlips{
	public static void main (String args[])
	{
		int a = 10;
		int b = 4;

		System.out.println("Val 1 : " + Integer.toBinaryString(a));
		System.out.println("Val 2 : " + Integer.toBinaryString(b));
		System.out.println("NO of flips : " + Integer.bitCount(a|b));
	}
}