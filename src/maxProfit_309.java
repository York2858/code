import java.util.Scanner;

public class maxProfit_309 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int[][] dp = new int[n][4];
        dp[0][1] = -prices[0];
        for(int i = 1; i < n; i++){
            dp[i][1] = Math.max(dp[i-1][3]-prices[i], dp[i-1][1]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1]+prices[i]);
            dp[i][3] = Math.max(dp[i-1][3], dp[i-1][2]);
        }
        return dp[n-1][2];
    }
}
