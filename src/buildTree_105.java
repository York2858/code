import util.TreeNode;

import java.util.Scanner;

public class buildTree_105 {
    public TreeNode solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];
        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }
        return buildTree(preorder,0,n,inorder,0,n);
    }
    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder,int inStart,int inEnd){
        if(preStart >= preEnd || inStart >= inEnd){
            return null;
        }
        int x = preorder[preStart];
        int mid = -1;
        for(int i = inStart;i<inEnd;i++){
            if(inorder[i]==x){
                mid = i;
                break;
            }
        }
        TreeNode node = new TreeNode(inorder[mid]);
        node.left = buildTree(preorder,preStart+1,preStart+mid-inStart+1,inorder,inStart,mid);
        node.right = buildTree(preorder,preStart+mid-inStart+1,preEnd,inorder,mid+1,inEnd);
        return node;
    }
}
