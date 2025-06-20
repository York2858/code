import util.TreeNode;

public class searchBST_700 {
    public TreeNode solution(TreeNode root, int val){
        if(root == null){ return null;}
        if(root.val == val){return root;}
        if(root.val > val){
            return solution(root.left, val);
        }
        if(root.val < val){
            return solution(root.right, val);
        }
        return root;
    }
}
