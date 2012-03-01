
public abstract class AbstractClass {
	protected static String s;
	
	protected static void changeS(String str){
		s = str;
	}
	
	protected void printS(){
		System.out.println(s);
	}
}
