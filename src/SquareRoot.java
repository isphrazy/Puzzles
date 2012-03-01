
public class SquareRoot {
	public static void main(String[] args){
		System.out.println(squareRoot(100));
	}

	private static double squareRoot(double n) {
		double guess = roughEstimate(n);
		double prevGuess = 0;
		double epsilon = 0.0001;
		while(prevGuess <= guess * (1 + epsilon) ){
			prevGuess = guess;
			guess = (guess + n / guess)/2;
		}
		return guess;
	}

	private static double roughEstimate(double n) {
		double result = n;
		do{
			result /= 2;
		}
		while(result * result > n);
		return result;
	}
}
