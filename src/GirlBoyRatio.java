
public class GirlBoyRatio {
	public static void main(String[] args){
		double sum = 0;
		for(int i = 1; i < 1000; i++){
			sum += i / Math.pow(2, i + 1);
		}
		System.out.println("sum: " + sum);
	}
}
