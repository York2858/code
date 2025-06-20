import java.util.Scanner;

public class findMaxForm_474_X {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] strs = new String[len];
        for (int i = 0; i < len; i++){
            strs[i] = sc.next();
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        //m个0，n个1 最多子集
        int[][] dp = new int[m+1][n+1];
        int zeroNum;
        int oneNum;
        // 先物品
        for (String str : strs){
            zeroNum = 0;
            oneNum = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == '0'){
                    zeroNum++;
                }
                if (str.charAt(i) == '1'){
                    oneNum++;
                }
            }
            // 后背包
            for(int i = m; i >= zeroNum; i--){
                for(int j = n; j >= oneNum; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeroNum][j-oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
