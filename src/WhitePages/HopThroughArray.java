package WhitePages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * this class takes a file as input, takes the non-negative integer in the file as array, 
 * prints the shortest path to hop the array. If no path found, print fail message
 * 
 * Example array: [5, 6, 0, 4, 2, 4, 1, 0, 0, 4]
 * 
 * Start at the first (0th) index of the array, look at the value there, and you can hop 
 * forward to any array index that’s no farther than that value away.  So in this case, 
 * you start at index 0 containing the value 5 and can now consider hopping to any of 
 * indices 1 through 5 inclusive.  If you choose to hop to index 3, there’s a 4 there 
 * and you can now hop up to 4 more spots from your current index (3)—so you now consider 
 * indices 4 through 7
 * 
 * @author Pingyang He
 *
 */
public class HopThroughArray {
	
	private static final String ARGUMENT_ERROR_MESSAGE = "Please specify a file name";
	private static final String FILE_READING_ERROR_MESSAGE = "The file is not found";
	private static final String DATA_TYPE_ERROR = "The file should not contain non integer";
	private static final String FILE_EMPTY_ERROR = "The file should not be empty";
	private static final String NO_POSSIBLE_PATH = "There is no possible path to hob the array";
	
	public static void main(String[] args){
		
		//if there is no input file
		if(args.length < 1)
			printTerminatingMessage(ARGUMENT_ERROR_MESSAGE);
		
		//read file
		Scanner sc = null;
		try {
			sc = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			printTerminatingMessage(FILE_READING_ERROR_MESSAGE);
		}
		
		//find the shortest path
		try{
			printShortestPath(sc);
		}catch (InputMismatchException e){
			printTerminatingMessage(DATA_TYPE_ERROR);
		}catch (NoSuchElementException e){
			printTerminatingMessage(FILE_EMPTY_ERROR);
		}
		
	}
	
	//print the shortest path to hop the array if found,
	//otherwise, print path not found message
	private static void printShortestPath(Scanner sc) {
		
		//current index of array reached
		int currentRange = 0;
		
		//next range that will be checked
		int newRange = sc.nextInt();
		
		//records the shortest path
		ArrayList<Integer> path = new ArrayList<Integer>();
		path.add(currentRange);
		
		while(true){
			int nextMove = 0;
			int previousNewRange = newRange;
			for(int i = currentRange + 1; i <= previousNewRange; i++){
				if(sc.hasNext()){
					int current = sc.nextInt() + i;
					//update newRange if the value at current index could reach further
					if(current > newRange){
						nextMove = i;
						newRange = current;
					}
				}else //the previousNewRange is larger than the length of array, print path
					printTerminatingMessage(path.toString());
			}
			
			
			if(newRange > previousNewRange){
				path.add(nextMove);
				currentRange = previousNewRange;
			}else //newRange is not increased, no way could go further.
				printTerminatingMessage(NO_POSSIBLE_PATH);
		}
	}

	//print the given message and terminate the program
	private static void printTerminatingMessage(String message) {
		System.out.println(message);
		System.exit(1);
	}
}
