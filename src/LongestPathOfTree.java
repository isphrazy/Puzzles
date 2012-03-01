
public class LongestPathOfTree {
	public static void main(String[] args){
		Node root = new Node(10);
		Node l = new Node(10);
		Node r = new Node(10);
		Node rl = new Node(10);
		Node ll = new Node(10);
		Node lr = new Node(10);
		Node lrr = new Node(10);
		Node lll = new Node(10);
		Node llll = new Node(10);
		Node lrrr = new Node(10);
		
		root.left = l;
		root.right = r;
		r.left = rl;
		l.left = ll;
		ll.left = lll;
//		lll.left = llll;
		l.right = lr;
		lr.right = lrr;
//		lrr.right = lrrr;
		System.out.println(longestPath(new Node())[1]);
	}
	
	//height, pathLength
	private static int[] longestPath(Node node){
		if(node == null) return new int[]{-1, -1};
		int[] left = longestPath(node.left);
		int[] right = longestPath(node.right);
		int height = Math.max(left[0], right[0]) + 1;
		return new int[]{height, Math.max(left[0] + right[0] + 2, Math.max(left[1], right[1]))};
		
	}
}
