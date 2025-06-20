import util.TreeNode;

public class sumOfLeftLeaves_404 {
    int res = 0;
    public int solution(TreeNode root){
        backing(root);
        return res;
    }
    public void backing(TreeNode root){
        if(root == null) return;
        backing(root.left);
        if(root.left != null && root.left.left == null && root.left.right == null){
            res += root.left.val;
        }
        backing(root.right);
    }
}
