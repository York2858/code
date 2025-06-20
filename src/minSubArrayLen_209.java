import java.util.Scanner;

public class minSubArrayLen_209 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int res = Integer.MAX_VALUE, sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target && left <= right) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
