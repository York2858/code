import util.TreeNode;

public class getMinimumDifference_530 {
    int res = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int solution(TreeNode root){
        traverse(root);
        return res;
    }
    public void traverse(TreeNode root){
        if(root == null) return;
        solution(root.left);
        if(pre != null){
            if(Math.abs(root.val - pre.val) < res) res = Math.abs(root.val - pre.val);
        }
        pre = root;
        solution(root.right);
    }
}
