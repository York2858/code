import util.ListNode;

public class mergeKLists_23 {
    public ListNode solution(ListNode[] lists) {
        return meger(lists,0,lists.length-1);
    }

    public ListNode meger(ListNode[] lists,int l ,int r){
        if(l > r) return null;
        if(l == r) return lists[l];
        int mid = l + (r-l) / 2;
        ListNode left = meger(lists,0,mid);
        ListNode right = meger(lists,mid+1,r);
        return megerTwo(left,right);
    }

    public ListNode megerTwo(ListNode left,ListNode right){
        if(left == null) return right;
        if(right == null) return left;

        if(left.val > right.val){
            right.next = megerTwo(left,right.next);
            return right;
        }else{
            left.next = megerTwo(left.next,right);
            return left;
        }
    }
}
