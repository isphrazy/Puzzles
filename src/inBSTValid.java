/**
 * test if the BST is valid, which means all the node on the left has less value,
 * all the node on the right has higher value
 * @author Pingyang He
 *
 */
public class inBSTValid {
	
	private static int previous = Integer.MIN_VALUE;
	
	public static void main(String[] args){
		Node root = new Node(50);
		Node l = new Node(30);
		Node lr = new Node(40);
		Node r = new Node(80);
		Node rr = new Node(90);
		Node rrr = new Node(95);
		root.left = l;
		root.right = r;
		l.right = lr;
		r.right = rr;
		rr.right = rrr;
		System.out.println(isValid(root));
	}

	private static boolean isValid(Node root) {
		boolean flag = true;
		if(root.left != null){
			flag = isValid(root.left);
		}
		
		if(root.value < previous) return false;
		previous = root.value;
		if(root.right != null){
			flag &= isValid(root.right);
		}
		return flag;
	}
}
