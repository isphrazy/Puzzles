
public class BuildBSTFromSortedArray {
	public static void main(String[] args){
		
		Node root = buildBST(new int[]{1, 2});
		printTree(root);
	}

	private static void printTree(Node root) {
		
	}

	private static Node buildBST(int[] array) {
		return helper(array, 0, array.length - 1);
	}
	
	private static Node helper(int[] array, int start, int end){
		if(start == end) return new Node(array[start]);
		if(end - start < 2){
			Node node = new Node(array[start]);
			node.right = new Node(array[end]);
			return node;
		}
		int mid = (start + end) / 2;
		Node node = new Node(array[mid]);
		node.left = helper(array, start, mid - 1);
		node.right = helper(array, mid + 1, end);
		return node;
	}
}
