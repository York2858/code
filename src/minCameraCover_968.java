import util.TreeNode;

public class minCameraCover_968 {
    int res = 0;
    public int solution(TreeNode root) {
        if(backing(root) == 0){
            res++;
        }
        return res;
    }
    public int backing(TreeNode node) {
        if (node == null)
            return 2;

        int left = backing(node.left);
        int right = backing(node.right);
        if (left == 2 && right == 2)
            return 0;
        else if (left == 0 || right == 0) {
            res++;
            return 1;
        } else
            return 2;
    }
}
