package GenericTest;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class GTest {
	public void test(){
		ArrayList <String> stringList = new ArrayList<String>();
//		ArrayList<? extends Foo> list = new ArrayList<Foo>();
		ArrayList <Foo> foolList = new ArrayList<Foo>();
		foolList.add(new Foo());
		foolList.add(new FooSon());
//		printCollection(stringList);
		printCollectionWild(stringList);
		printFoolCollectionWild(foolList);
		printSubtypeFoolCollectionWild(foolList);
	}
	
	
	public void printCollection(Collection<Object> c){
		
	}
	public void printCollectionWild(Collection<?> c){
		
	}
	public void printFoolCollectionWild(Collection<Foo> c){
		
	}
	public void printSubtypeFoolCollectionWild(Collection<? extends Foo> c){
		
	}
	
	public class MyList<E>{
		private ArrayList<E> list = new ArrayList<E>();
		public void add(E a){
			list.add(a);
		}
		
	}
	
	
}
