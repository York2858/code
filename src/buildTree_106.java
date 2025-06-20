import util.TreeNode;

import java.util.Scanner;

public class buildTree_106 {
    public TreeNode solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inorder = new int[n];
        int[] postorder = new int[n];
        for(int i = 0; i < n; i++){
            inorder[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            postorder[i] = sc.nextInt();
        }
        return traverse(inorder,0,inorder.length,postorder,0,postorder.length);
    }
    public TreeNode traverse(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if(inStart >= inEnd || postStart >= postEnd){ return null; }
        int x = postorder[postEnd-1];
        int mid = -1;
        for (int i = inStart; i <= inEnd; i++){
            if (inorder[i] == x){
                mid = i;
                break;
            }
        }
        TreeNode root = new TreeNode(mid);
        root.left = traverse(inorder,inStart,mid,postorder,postStart,postStart+mid-inStart);
        root.right = traverse(inorder,mid+1,inEnd,postorder,postStart+mid-inStart,postEnd-1);
        return root;
    }
}
