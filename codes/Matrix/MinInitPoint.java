import java.util.*;
class MinInitPoint{

	public static void displayMat (int mat[][])
	{
		Arrays.asList(mat).stream().map(v-> Arrays.toString(v)).forEach(System.out::println);
	}

	public static void main (String args[])
	{
		System.out.println("Monkey King arrived ...!");
		int mat[][] = { {-2,-3,3}, 
                      {-5,-10,1}, 
                      {10,30,-5} 
                    }; 
        displayMat(mat);
        System.out.println("---------------");
        int m = mat.length;
        int n = mat[0].length;
        System.out.println("Row and column : "+m+ " " +n );

        mat[m-1][n-1] = mat[m-1][n-1] > 0  ? 1 : Math.abs(mat[m-1][n-1]) + 1;
        
        displayMat(mat);

        for (int i = m-2; i >= 0 ; i--)
        	mat[i][n-1] = Math.max(mat[i+1][n-1] - mat[i][n-1], 1);

        for (int j = n-2; j >= 0 ; j--)
        	mat[m-1][j] = Math.max(mat[m-1][j+1] - mat[m-1][j], 1);

        for (int i = m-2; i >= 0; i--){
        	for (int j = n-2; j >= 0; j--){
        		int min_val = Math.min(mat[i+1][j], mat[i][j+1]);
        		mat[i][j] = Math.max(min_val - mat[i][j], 1); 
        	}
        }
        System.out.println("Ans : "+ mat[0][0]);

	}
}