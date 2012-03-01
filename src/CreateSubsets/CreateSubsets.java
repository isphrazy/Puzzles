package CreateSubsets;

import java.util.Set;
import java.util.HashSet;

public class CreateSubsets {
	public static void main(String[] args){
		Set<Integer> src = new HashSet<Integer>();
		src.add(0);
		src.add(1);
		src.add(2);
		src.add(3);
//		System.out.println(src.toString());
		Set<HashSet<Integer>> subsets = createSubset(src);
		for(Set<Integer> subset :  subsets){
			System.out.println(subset.toString());
		}
	}

	private static Set<HashSet<Integer>> createSubset(Set<Integer> src) {
		Set<HashSet<Integer>> result = new HashSet<HashSet<Integer>>();
		result.add(new HashSet<Integer>());
		for(Integer n : src){
			Set<HashSet<Integer>> newSet = new HashSet<HashSet<Integer>>();
			newSet.addAll(result);
			for(HashSet<Integer> subset : newSet){
				result.add(union(subset, n));
			}
		}
		return result;
	}
	
	private static HashSet<Integer> union(Set<Integer> org, int n){
		HashSet<Integer> newSet = new HashSet<Integer>();
		newSet.addAll(org);
		newSet.add(n);
		return newSet;
	}
}
