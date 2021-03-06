package TreeEasy;

public class No235LowestCommonAncestorofaBST {

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            root = q.val < root.val ? root.left : root.right;
        }
        
        return root;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
