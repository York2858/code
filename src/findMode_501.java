import util.TreeNode;

import java.util.ArrayList;

public class findMode_501 {
    int[] res;
    TreeNode pre = null;
    int count = 0;
    int maxcount = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int[] solution(TreeNode root){
        traverse(root);
        res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    public void traverse(TreeNode root){
        if(root == null){return;}
        traverse(root.left);
        if(pre == null){
            count = 1;
        }else if(pre.val == root.val){
            count++;
        }else{
            count = 1;
        }
        pre = root;
        if(count == maxcount){
            list.add(pre.val);
        }else if(count > maxcount){
            list.clear();
            maxcount = count;
            list.add(pre.val);
        }
        traverse(root.right);
    }
}
