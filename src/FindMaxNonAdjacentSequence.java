public class FindMaxNonAdjacentSequence {
	public static void main(String[] args){
		
		System.out.println(findMaxNonAdjacentSequence(new int[]{1, -1, -2, -3, 3, 1}, 0, 0));
		
	}
	public static int findMaxNonAdjacentSequence(int[] nums, int index, int sum) {
		if(index == nums.length - 1){
			return sum + nums[index];
		}else if(index == nums.length){
			return sum;
		}
		
		return Math.max(findMaxNonAdjacentSequence(nums, index + 2, sum + nums[index]), 
		findMaxNonAdjacentSequence(nums, index + 1, sum));
		
		
	}
}