import util.TreeNode;

public class isBalanced_110 {
    boolean res = true;
    public boolean  solution(TreeNode root){
        backing(root);
        return res;
    }
    public int backing(TreeNode root){
        if(root == null){return 0;}
        int left = backing(root.left);
        int right = backing(root.right);
        if(Math.abs(left-right)>1){
            res = false;
        }
        return Math.max(left,right)+1;
    }
}
