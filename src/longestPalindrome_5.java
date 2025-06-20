import util.TreeNode;

import java.util.Scanner;

public class longestPalindrome_5 {
    public void solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int len = ch.length;
        boolean[][] dp = new boolean[len][len];
        int start = 0;
        int end = 0;
        for(int r = 1 ; r < len; r++){
            for(int l = 0 ; l < r ; l++){
                if(ch[l] == ch[r] && (r-l <= 2 || dp[l+1][r-1])){
                    dp[l][r] = true;
                    if(r-l+1 > end-start+1){
                        start = l;
                        end = r;
                    }
                }
            }
        }
        String res = s.substring(start,end+1);
        System.out.println(res);
    }
}
