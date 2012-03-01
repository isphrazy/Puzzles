package SQLCommandCreater;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsertCommand {
	public static void main(String[] args) throws FileNotFoundException{
		if(args.length != 1){
			System.out.println("Argument should be the name of the file");
		}else{
			Scanner s = new Scanner(new File(args[0]));
			while(s.hasNext()){
				System.out.println("insert into Team values(" + "\'" + s.next() + "\', " + "\'" + s.next() + "\', "
						+ s.nextInt() + ", " + s.nextInt() + ");");
//				System.out.println("insert into Scores values(" + "\'" + s.next() + "\', " + "\'" + s.next() + "\', \'"
//						+ s.next() + "\', " + s.next() + ");");
			}
		}
		
	}
}
