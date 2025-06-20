import java.util.Scanner;

public class change_518 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        // 总金额amount有多少组合
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        // 组合问题先背包，后物品
        for(int i = 0; i < n; i++){
            for(int j = coins[i]; j <= amount; j++){
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
