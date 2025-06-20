import java.util.Scanner;

public class maxProfit_188 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[][] dp = new int[n][2*k+1];
        for(int i = 1; i <= 2*k;i++){
            if(i % 2 == 1){
                dp[0][i] = -prices[0];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= 2*k; j++){
                if(j % 2 == 0){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]+prices[i]);
                }
                if(j % 2 == 1){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]-prices[i]);
                }
            }
        }
        int res = 0;
        for(int i = 1; i <= 2*k; i++){
            if(i % 2 == 0)
            {
                res = Math.max(res, dp[n-1][i]);
            }
        }
        return res;
    }
}
