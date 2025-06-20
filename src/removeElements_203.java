import util.ListNode;

public class removeElements_203 {
    public ListNode solution(ListNode head, int val){
        ListNode cur = head;
        ListNode dumpNode = new ListNode(0,cur);
        ListNode prev = dumpNode;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return dumpNode.next;
    }
}
