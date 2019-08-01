class Triplet{
	
	public static void main (String args [])
	{
		int arr [] = {1, 2,3,4,5};
		int toal = 10;

		for (int i = 0; i < arr.length-2 ; i++ ){
			for (int j = i+1; j < arr.length-1; j++){
				for (int k = j+1; k< arr.length; k++){
					int sum = arr[i] + arr[j] + arr[k];
					System.out.println("currn : " + sum);
					if (sum == toal){
						System.out.println(" Ans : " +arr[i] + " " + arr[j] + " " + arr[k] );
					}
				}
			}
		}
	}
}