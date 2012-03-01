public class ReverseWordsInSentence {
	public static void main(String[] args){
		System.out.println(reverseWords("helllooo haa "));
	}
	
	private static String reverseWords(String sentence){
		String result = "";
		String rWord = "";
		for(int i = 0; i < sentence.length(); i++){
			char current = sentence.charAt(i);
			if(current != ' '){
				rWord = current + rWord;
			}else{
				result += rWord + " ";
				rWord = "";
			}
		}
		result += rWord;
		return result;
	}
}
