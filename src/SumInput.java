import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class SumInput {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("sumNumbers.txt"));
		int sum = 0;
		while(sc.hasNextInt()){
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
}
