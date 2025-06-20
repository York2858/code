import util.TreeNode;

public class insertIntoBST_701 {
    public TreeNode solution(TreeNode root,int val){
        return traverse(root,val);
    }
    public TreeNode traverse(TreeNode root,int val){
        if(root==null){
            TreeNode node=new TreeNode(val);
            return node;
        }
        if(root.val > val){
            root.left =  traverse(root.left,val);
        }
        if(root.val < val){
            root.right = traverse(root.right,val);
        }
        return root;
    }
}
