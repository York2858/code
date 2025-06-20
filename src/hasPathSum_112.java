import util.TreeNode;

public class hasPathSum_112 {

    public boolean solution(TreeNode root, int targetSum){
        return backing(root,targetSum);
    }
    private boolean backing(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        if (root.left == null && root.right == null && targetSum != 0) {
            return false;
        }
        if(backing(root.left, targetSum)) return true;
        if(backing(root.right, targetSum)) return true;
        return false;
    }

}
