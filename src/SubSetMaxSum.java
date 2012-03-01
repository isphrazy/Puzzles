
public class SubSetMaxSum {
	public static void main(String[] args){
		System.out.println(maxSubset(new int[]{1, 2, 3, -10, 7}));
	}
	
	private static int maxSubset(int[] set){
		
		int sum = 0;
		int currentSum = 0;
		for(int i = 0; i < set.length; i++){
			currentSum += set[i];
			if(currentSum > sum) sum = currentSum;
			if(currentSum < 0) currentSum = 0;
		}
		return sum;
	}
}
