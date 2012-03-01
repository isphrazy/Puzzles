
/**
	 * the class that contains the info about the node
	 */
	public class Node{
		Node left, middle,right;
		int value;
		int height;
		
		public Node(){
			
		}
		
		public Node(int value){
			this.value = value;
		}
		
		/**
		 * constructor that will create a new node with given children
		 * @param left is left node
		 * @param middle  is middle node
		 * @param right  is right node
		 * @param v is the value of given node
		 */
		public Node(Node left, Node middle, Node right, int v){
			this.left = left;
			this.middle = middle;
			this.right = right;
			this.value = v;
		}
	}