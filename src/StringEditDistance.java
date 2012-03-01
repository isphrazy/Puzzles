import java.util.Arrays;


public class StringEditDistance {

	public static void main(String[] args){
		System.out.println(distance("abccc".toCharArray(), "cbaaa".toCharArray()));
	}
	
	public static int distance(char[] m, char[] n){
		int mLength = m.length; 
		int nLength = n.length;
		int[][] matrix = new int[mLength + 1][nLength + 1];
		for(int i = 0; i <= mLength; i++){
			matrix[i][0] = i;
		}
		for(int i = 0; i <= nLength; i++){
			matrix[0][i] = i;
		}
		for(int i = 1; i <= mLength; i++){
			for(int j = 1; j <= nLength; j++){
				if(m[i - 1] == n[j - 1]) matrix[i][j] = matrix[i - 1][j - 1];
				else{
					matrix[i][j] = Math.min(matrix[i - 1][j - 1], 
									Math.min(matrix[i - 1][j], matrix[i][j - 1])) + 1;
				}
			}
		}
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
		return matrix[mLength][nLength];
	}
}
