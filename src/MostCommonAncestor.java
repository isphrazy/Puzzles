
public class MostCommonAncestor {
	public static void main(String[] args){
		Node root = new Node(50);
		Node l = new Node(25);
		Node r = new Node(75);
		Node rl = new Node(62);
		Node ll = new Node(12);
		Node lr = new Node(37);
		Node lrr = new Node(42);
		Node lll = new Node(6);
		Node llll = new Node(3);
		Node lrrr = new Node(46);
		
		root.left = l;
		root.right = r;
		r.left = rl;
		l.left = ll;
		ll.left = lll;
		lll.left = llll;
		l.right = lr;
		lr.right = lrr;
		lrr.right = lrrr;
		
		Node mca = mostCommonAncestor(lrr, rl, root);
		System.out.println(mca.value);
		
	}
	
	private static Node mostCommonAncestor(Node a, Node b, Node root){
		if(root == null) return null;
		if(a == b) return a;
		if(root == a){
			return a;
		}else if(root == b){
			return b;
		}
		Node left = mostCommonAncestor(a, b, root.left);
		Node right = mostCommonAncestor(a, b, root.right);
		if((left == a && right == b) || (left  == b && right == a)) return root;
		if(left == null) return right;
		return left;
	}
}
