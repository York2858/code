import util.TreeNode;

public class mergeTrees_617 {
    public TreeNode solution(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){return null;}
        if(root1 != null && root2 == null){ return root1;}
        if(root1 == null && root2 != null){ return root2;}
        TreeNode newRoot = new TreeNode(root1.val + root2.val);
        newRoot.left = solution(root1.left, root2.left);
        newRoot.right = solution(root1.right, root2.right);
        return newRoot;
    }
}
