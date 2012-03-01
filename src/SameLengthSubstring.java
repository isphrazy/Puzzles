import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given a list of words, L, that are all the same length, and a string, S, 
 * find the starting position of the substring of S that is a concatenation 
 * of each word in L exactly once and without any intervening characters. 
 * This substring will occur exactly once in S..
 * Example:
	
	L: "fooo", "barr", "wing", "ding", "wing".
	
	S: "lingmindraboofooowingdingbarrwingmonkeypoundcake".
	
	fooowingdingbarrwing.
	
 * @author Pingyang He
 *
 */
public class SameLengthSubstring {
	
	public static void main(String[] args){
		System.out.println(contains("lingmindraboofooowingdingbarrwingmonkeypoundcake", 
				new String[]{"fooo","barr", "wing", "ding", "wing"}));
	}
	
	private static int contains(String s, String[] l){
		int size = l.length;
		if(size < 1) return -1;
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < size; i++){
			set.add(l[i]);
		}
		int length = l[0].length();
		ArrayList<String> list = new ArrayList<String>();
		int sLength = s.length();
		int lLength = size * length;
		for(int i = 0; i < sLength - lLength + 1; i++){
			list.add(s.substring(i, i + lLength));
		}
		int index = -1;
		for(int j = 0; j < list.size(); j++){
			String sub = list.get(j);
			boolean found = true;
			for(int i = 0; i < lLength; i += 4){
				if(!set.contains(sub.subSequence(i, i + 4))){
					found = false;
					break;
				}
			}
			if(found){
				index = j;
				break;
			}
			
		}
		return index;
	}
}
