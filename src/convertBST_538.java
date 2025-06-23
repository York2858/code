import util.TreeNode;

public class convertBST_538 {
    int pre = 0;
    public TreeNode solution(TreeNode root){
        backing(root);
        return root;
    }
    public void backing(TreeNode root){
        if(root == null) return;
        backing(root.right);
        root.val += pre;
        pre = root.val;
        backing(root.left);
    }
}
