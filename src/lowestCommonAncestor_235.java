import util.TreeNode;

public class lowestCommonAncestor_235 {
    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q){
        int minVal = 0, maxVal = 0;
        if(p.val > q.val){
            minVal = q.val;
            maxVal = p.val;
        }else{
            minVal = p.val;
            maxVal = q.val;
        }
        return traverse(root,minVal,maxVal);
    }
    public TreeNode traverse(TreeNode root, int minVal, int maxVal){
        if(root == null){ return null; }
        if(root.val < minVal){
            TreeNode right =  traverse(root.right,minVal,maxVal);
            if(right != null){ return right; }
        }
        if(root.val > maxVal){
            TreeNode left =  traverse(root.left,minVal,maxVal);
            if(left != null){ return left; }
        }
        return root;
    }
}
