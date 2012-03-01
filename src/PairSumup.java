import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairSumup {
	public static void main(String[] args){
		pairSumup(new int[]{1, 9, 1, 9, 1}, 10);
	}
	
	public static void pairSumup(int[] array, int sum){
		
		Arrays.sort(array);
			
		int first = 0;
			
		int last = array.length - 1;
			
		while (first < last) {
				
			int s = array[first] + array[last];
					
			if (s == sum) {
						
			System.out.println(array[first] + " " + array[last]);
						
			++first;
						
			--last;
					
			} else {
						
			if (s < sum) ++first;
						
			else --last;

			}
		}
	}
}
