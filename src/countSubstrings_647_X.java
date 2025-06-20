import java.util.Scanner;

public class countSubstrings_647_X {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int res = 0;
        for(int r = 0; r < len; r++){
            for(int l = 0; l <= r; l++){
                if(s.charAt(l) == s.charAt(r)){
                    if(r-l <= 1){
                        res += 1;
                        dp[l][r] = true;
                    }else if(dp[l+1][r-1]){
                        res += 1;
                        dp[l][r] = true;
                    }
                }
            }
        }
        return res;
    }
}
