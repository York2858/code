import util.TreeNode;

import java.util.Scanner;

public class constructMaximumBinaryTree_654 {
    public TreeNode solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        return traverse(nums,0,n);
    }
    private TreeNode traverse(int[] nums, int start, int end){
        if(start >= end) return null;
        int mid = findMax(nums,start,end);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traverse(nums,start,mid);
        root.right = traverse(nums,mid+1,end);
        return root;
    }
    private int findMax(int[] nums, int start, int end){
        int max = nums[start];
        int maxIndex = start;
        for(int i = start+1; i < end; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
