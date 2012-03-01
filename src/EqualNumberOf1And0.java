import java.util.HashMap;
import java.util.Map;


public class EqualNumberOf1And0 {
	public static void main(String[] args){
		System.out.println(count(new int[]{1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1}));
		System.out.println(count(new int[]{1, 1, 1, 1, 1, 0}));
		System.out.println(count(new int[]{1, 0}));
		System.out.println(count(new int[]{0, 0}));
		System.out.println(count(new int[]{1, 0, 0}));
	}
	public static int count(int[] array){
		Map<Integer, Interval> map = new HashMap<Integer, Interval>();
		map.put(0, new Interval(-1));
		int max = 0;
		int diff = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == 1){
				diff ++;
			}else{
				diff --;
			}
			Interval current = map.get(diff);
			if(current != null){
				current.setEnd(i);
				max = Math.max(max, current.returnDiff());
			}else{
				map.put(diff, new Interval(i));
			}
		}
		return max;
	}
	
	private static class Interval{
		int start;
		int end;
		public Interval(int start){
			this.start = start;
		}
		
		public void setEnd(int end){
			this.end = end;
		}
		
		public int returnDiff(){
			return end - start;
		}
	}
}
