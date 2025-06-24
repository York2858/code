import util.ListNode;
import util.TreeNode;
import util.levelOrder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        subsetsWithDup_90 subsetsWithDup_90 = new subsetsWithDup_90();
        List<List<Integer>> res = subsetsWithDup_90.solution();
        for (List<Integer> list : res) {
            System.out.println(list);
        }

    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int i : arr) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static TreeNode createTree() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] words = line.split("\\s+");
        int n = words.length;
        TreeNode root = null;
        if(!words[0].equals("null")){
            root = new TreeNode(Integer.parseInt(words[0]));
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < n) {
            TreeNode node = queue.poll();
            if(i < n && !words[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(words[0]));
                queue.add(node.left);
            }
            i++;
            if(i < n && !words[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(words[0]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}