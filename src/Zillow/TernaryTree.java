package Zillow;


/**
 * this class contains a ternary tree
 */
public class TernaryTree{
	Node overallRoot;
	/**
	 * constructor, creates a new TernaryTree
	 */
	public TernaryTree(){
		overallRoot = null;
	}
	
	/**
	 * insert a given number to the ternary tree
	 * @param v the value will be added to the
	 */
	public void insert(int v){
		overallRoot = insertHelper(overallRoot, v);
	}

	/**
	 * insert a given value to a given node
	 * @param node the node that will be processed
	 * @param v the value that will be insert
	 * @return the node that has been processed
	 */
	private Node insertHelper(Node node, int v) {
		if(node == null) return new Node(null, null, null, v);
		if(v < node.value) node.left = insertHelper(node.left, v);
		else if(v == node.value) node.middle = insertHelper(node.middle, v);
		else node.right = insertHelper(node.right, v);
		return node;
	}
	
	/**
	 * delete a given value from the ternary tree
	 * @param v the value that will be delete
	 */
	public void delete(int v){
		overallRoot = deleteHelper(overallRoot, v);
	}
	/**
	 * delete a given value from given node
	 * @param node will be processed
	 * @param v is the value that will be deleted from given node
	 * @return a node that has already been processed
	 */
	private Node deleteHelper(Node node, int v) {
		if(node == null) return null;
		if(node.value == v){
			if(node.left == null && node.right == null) return null;
			else if(node.left == null && node.right != null) return node.right;
			else if(node.right == null && node.left != null) return node.left;
			else {
				Node minNode = findMin(node.right);
				deleteHelper(node.right, minNode.value);
				minNode.left = node.left;
				minNode.left = node.right;
				return minNode;
			}
		}else if(v < node.value){
			node.left = deleteHelper(node.left, v);
		}else if(v > node.value){
			node.right = deleteHelper(node.right, v);
		}
		return node;
	}
	
	/**
	 * return the node that has minimum value that in the given node
	 * @param node is the tree node that it's minimum number will be deleted
	 * @throws IllegalArgumentException if the given node is null
	 */
	public Node findMin(Node node){
		if(node == null) 
			throw new IllegalArgumentException("passed in node should not be null");
		if(node.left != null) return findMin(node.left);
		else return node;
	}
	
	public String printTree(Node node, int height){
		String result = "";
		for(int i = 0; i < height; i++) result += " ";
		if(node == null) return result += "-\n";
		result += node.value;
		if(node.left != null || node.middle != null || node.right != null){
			result += printTree(node.left, height + 1);
			result += printTree(node.middle, height + 1);
			result += printTree(node.right, height + 1);
		}
		return result + "\n";
	}
	/**
	 * the class that contains the info about the node
	 */
	public class Node{
		Node left, middle,right;
		int value;
		
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
}


