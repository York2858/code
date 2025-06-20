import util.TreeNode;

public class minDepth_111 {
    int res = Integer.MAX_VALUE;
    public int solution(TreeNode root){
        if(root == null) return 0;
        backing(root,1);
        return res;
    }
    public void backing(TreeNode root,int deep){
        if(root == null) return;
        if(root.left == null && root.right == null){
            res = Math.min(res,deep);
        }
        if(root.left != null) backing(root.left,deep+1);
        if(root.right != null) backing(root.right,deep+1);
    }
}
