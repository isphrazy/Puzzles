package TrivialMethodCreater;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrivialMethodCreater {
	public static void main(String[] args) throws FileNotFoundException{
//		File f = new File(args[0]);
		Scanner scn = new Scanner(new File("var.txt"));
		while(scn.hasNext()){
			String var = scn.next();
			char firstLetter = var.toUpperCase().charAt(0);
			String remain = var.substring(1);
			String type = scn.next();
			System.out.printf("public void set%c%s(%s %s){\n\tthis.%s = %s;\n}\n\n", 
								firstLetter, remain, type, var, var, var);
			System.out.printf("public %s get%c%s(){\n\treturn %s;\n}\n\n", type, firstLetter, remain, var);
		}
		
		
	}
}
