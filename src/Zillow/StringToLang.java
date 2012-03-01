package Zillow;

public class StringToLang {
	
	public static void main(String[] args){
		System.out.println(stringToLong("-123"));
	}
	
	/**
	 * convert string to long.
	 * limitations: if the passed in string has the number that is larger than
	 * 				Long.MAX_VALUE(2^63 - 1) or smaller than Long.MIN_VALUE(-2^63), 
	 * 				the result will not be guaranteed.
	 * @requires passed in string should not be null
	 * @requires passed in string should not be empty
	 * @requires passed in string should not contain characters other than 0-9
	 * @param s is the string the will be converted to long
	 * @return long that is converted from string representation of that number
	 * @throws IllegalArgumentException if the passed in string is null
	 * @throws IllegalArgumentException if the passed in string is empty
	 * @throws NumberFormatException if the passed in string is not a number
	 */
	public static long stringToLong(String s){
		
		if(s == null)
			throw new IllegalArgumentException("string should not be null");
		int length = s.length();
		if(length == 0)
			throw new IllegalArgumentException("input string should not be empty");
		
		long result = 0;
		boolean negative = s.charAt(0) == '-';
		if(negative && s.length() == 1) 
			throw new NumberFormatException("passed in string is not a number");
		
		for(int i = negative? 1 : 0; i < length; i++){
			char c = s.charAt(i);
			//numeric string
			if(c >= 48 && c <= 57)
				result = result * 10 + (c - 48);
			else{
				throw new NumberFormatException("passed in string is not a number");
			}
		}
		return negative ? -result : result;
	}
}
