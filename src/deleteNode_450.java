import util.TreeNode;

public class deleteNode_450 {
    public TreeNode solution(TreeNode root, int key){
        if(root == null){return null;}
        if(root.val == key){
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            if(root.left != null && root.right != null){
                TreeNode cur = root.right;
                while(cur.left != null){
                    cur = cur.left;
                }
                cur.left = root.left;
                return root.right;
            }
        }
        if(root.val > key){
            root.left = solution(root.left, key);
        }
        if(root.val < key){
            root.right = solution(root.right, key);
        }
        return root;
    }
}
