import java.util.Scanner;

public class combinationSum4_377 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // 背包为 target 的组合数
        int[] dp = new int[target+1];
        dp[0] = 1;
         // 排列问题 先背包后物品
         for(int i = 1; i < target; i++){
             for(int j = 0; j < n; j++){
                 if(nums[j] <= i) dp[i] = dp[i] + dp[i - nums[j]];
             }
         }
         return dp[target];

    }
}
