import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths_257 {
    List<String> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<String> solution(TreeNode root){
        backing(root);
        return res;
    }
    public void backing(TreeNode root){
        temp.add(root.val);
        if(root.left == null && root.right == null){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < temp.size()-1; i++){
                sb.append(temp.get(i)).append("->");
            }
            sb.append(temp.get(temp.size()-1));
            res.add(sb.toString());
            return;
        }
        if(root.left != null){
            backing(root.left);
            temp.remove(temp.size()-1);
        }
        if(root.right != null){
            backing(root.right);
            temp.remove(temp.size()-1);
        }
    }
}
