import java.util.*;

public class nextGreaterElement_496_X {
    public int[] solution(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for(int i = 0; i < n; i++){
            map.put(nums1[i],i);
        }
        for(int i = 1; i < m; i++){
            if(nums2[stack.peek()] >= nums2[i]){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && nums2[stack.peek()] < nums2[i]){
                    if(map.containsKey(nums2[stack.peek()])){
                        int index = map.get(nums2[stack.peek()]);
                        res[index] = nums2[i];
                    }
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }
}
