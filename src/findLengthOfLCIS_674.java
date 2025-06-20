import java.util.Arrays;
import java.util.Scanner;

public class findLengthOfLCIS_674 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        if(n <= 1) return n;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int res = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i-1]){
                dp[i] = dp[i-1] + 1;
            }
            if(dp[i] > res){
                res = dp[i];
            }
        }
        return res;
    }
}
