
public class Fibonacci {
	public static void main(String[] args){
		System.out.println(findNthFib(10));
	}

	private static int findNthFib(int n) {
		int a = 0;
		int b = 1;
		for(int i = 2; i < n; i++){
			int tmp = b;
			b = a + b;
			a = tmp;
		}
		return b;
	}
}
