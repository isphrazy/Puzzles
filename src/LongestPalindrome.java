
public class LongestPalindrome {
	public static void main(String[] args){
		System.out.println(LongestPalindrome("abbab"));
	}

	private static int LongestPalindrome(String str) {
		int length = str.length();
		int i = 1;
		int parLen = 0;
		int maxParllength = 1;
		int potential = 0;
		boolean doubleCheckFlag  = false;
		while(i < length){
			char currentChar = str.charAt(i);
			int currentParllength = 0;
			if(currentChar == str.charAt(i - 1) || (i > 1 && currentChar == str.charAt(i - 2))){//potential parl find
				if(!doubleCheckFlag){
					if(i > 1 && currentChar == str.charAt(i - 2)){
						currentParllength += 3;
						doubleCheckFlag = currentChar == str.charAt(i - 1);
					}else{
						currentParllength += 2;
					}
				}else{
					doubleCheckFlag = false;
					currentParllength += 2;
				}
				potential = i;
				i++;
				boolean potentialSet = false;
				while(i < length && i - currentParllength - 1 >= 0 && str.charAt(i) == str.charAt( i - currentParllength - 1)){
					currentChar = str.charAt(i);
					if(currentChar == str.charAt(i - 1) ||  currentChar == str.charAt(i - 2) && !potentialSet){
						potential = i;
//						System.out.println(potential);
						potentialSet = true;
					}
					currentParllength += 2;
					i ++;
				}
				i = potential;
				maxParllength = Math.max(maxParllength, currentParllength);
				
			}
			if(!doubleCheckFlag)i++;
		}
		return maxParllength;
	}
}
