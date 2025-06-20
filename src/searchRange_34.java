import java.util.Scanner;

public class searchRange_34 {
    public int[] solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = new int[]{-1,-1};
        if(n == 0) return res;
        int start = search(nums, target);
        if(nums[start] != target){
            return new int[]{-1, -1};
        }
        int end = search(nums, target+1)-1;
        res[0] = start;
        res[1] = end;
        return res;
    }
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
