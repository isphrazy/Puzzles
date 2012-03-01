
public class MaxLengthInTree {
	public static void main(String[] args){
	
		Node root = new Node();
		markHeight(root);
		findMaxDistance(root);
	}

	private static int findMaxDistance(Node node) {
		if (node == null) return 0;
		int leftHeight = node.left == null ? 0 : node.left.height + 1;
		int rightHeight = node.right == null ? 0 : node.left.height + 1;
		return Math.max(leftHeight + rightHeight, 
						Math.max(findMaxDistance(node.left), findMaxDistance(node.right)));
	}

	private static int markHeight(Node node) {
		if(node == null) return -1;
		int height = Math.max(markHeight(node.left), markHeight(node.right)) + 1;
		node.height = height;
		return height;
	}
}
