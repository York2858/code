import java.util.Scanner;

public class minSubArrayLen_LCR_008 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = Integer.MAX_VALUE;
        int start = -1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while(sum >= target) {
                res = Math.min(res, i - start);
                start++;
                sum -= nums[start];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
