import util.ListNode;

public class sortList_148 {
    // 归并法
    public ListNode solution(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;

        ListNode left = solution(head);
        ListNode right = solution(temp);
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while(left != null && right != null){
            if(left.val < right.val){
                cur.next = left;
                left = left.next;
            }else{
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        cur.next = left != null ? left : right;
        return res.next;
    }
}
