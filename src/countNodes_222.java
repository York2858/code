import util.TreeNode;

public class countNodes_222 {
    public int solution(TreeNode root){
        return backing(root);
    }
    public int backing(TreeNode root){
        if(root== null){
            return 0;
        }
        int left = backing(root.left);
        int right = backing(root.right);
        return left + right + 1;
    }
}
