import java.util.Arrays;


public class SubsetSum3 {
	public static void main(String[] args){
		subsetSum(new int[]{1, 48, 0, -4, 53, 2}, 50);
	}

	private static void subsetSum(int[] array, int sum) {
		Arrays.sort(array);
		for(int i = 1; i < array.length - 1; i++){
			int start = 0;
			int end = array.length - 1;
			int current = array[i];
			while(start < end){
				int currentSum = current + array[start] + array[end];
				if(currentSum == sum){
					System.out.println(array[start] + " " + current + " " + array[end]);
					break;
				}
				else if(currentSum < sum) start++;
				else if(currentSum > sum) end--;
			}
		}
}

}
