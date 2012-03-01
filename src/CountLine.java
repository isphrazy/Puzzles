import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CountLine {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(args[0]));
		int count = 0;
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			if(s.trim().length() > 0) count++;
		}
		System.out.println(count);
	}
}
