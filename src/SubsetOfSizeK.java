import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of size n, find all the possible sub set of the array of size k
 * (all the subsets must be of size k).
 * @author Pingyang He
 *
 */
public class SubsetOfSizeK {
	public static void main(String[] args){
		Set<Integer[]> result = new HashSet<Integer[]>();
		int k = 3;
		subSetOfSize(new int[]{10, 4, 5, 34, 1}, 0, k, result, new Integer[k]);
		for(Integer[] set : result){
			System.out.println(Arrays.toString(set));
		}
	}
	
	private static void subSetOfSize(int[] a, int index, int k, Set<Integer[]> result, 
								Integer[] current){
		if(k == 0) result.add(current);
		else if(index < a.length){
			Integer[] newCurrent = Arrays.copyOf(current, 3);
			newCurrent[k - 1] = a[index];
			subSetOfSize(a, index + 1, k - 1, result, newCurrent);
			subSetOfSize(a, index + 1, k, result, current);
		}
		
	}
}
