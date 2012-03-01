import java.util.LinkedList;
import java.util.Queue;


public class PrintTreeLevelByLevel {
	public static void main(String[] args){
		Node root = new Node(); root.value = 1;
		Node left = new Node(); left.value = 2;
		root.left = left;
		root.right = new Node(); root.right.value = 3;
		Node leftleft = new Node(); leftleft.value = 4;
		root.left.left = leftleft;
		printTree(root);
	}

	private static void printTree(Node root) {
		Queue<Node> currentQueue = new LinkedList<Node>();
		currentQueue.add(root);
		Queue<Node> nextQueue = new LinkedList<Node>();			
		do{
			while(!currentQueue.isEmpty()){
			
				Node thisNode = currentQueue.remove();
				System.out.print(thisNode.value + " ");
				if(thisNode.left != null) nextQueue.add(thisNode.left);
				if(thisNode.right != null) nextQueue.add(thisNode.right);

			}
			System.out.println();
			currentQueue = nextQueue;
			nextQueue = new LinkedList<Node>();
		}while(!currentQueue.isEmpty());

		
	}
}
