import util.ListNode;

public class mergeTwoLists_21 {
    public ListNode solution(ListNode list1, ListNode list2){
        ListNode dumpNode = new ListNode(0);
        ListNode cur = dumpNode;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return dumpNode.next;
    }
}
