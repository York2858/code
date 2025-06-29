/*738. 单调递增的数字

当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。
给定一个整数 n ，返回 小于或等于 n 的最大数字，且数字呈 单调递增 。

示例 1:
输入: n = 10
输出: 9

示例 2:
输入: n = 1234
输出: 1234

示例 3:
输入: n = 332
输出: 299

提示:
        0 <= n <= 109
        */
public class monotoneIncreasingDigits_738_X {
    public int solution(int n) {
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        int len = c.length;
        int flag = len;
        for(int i = len -1; i > 0; i--){
            if(c[i] < c[i-1]){
                c[i-1]--;
                flag = i;
            }
        }
        for(int i = flag; i < len; i++){
            c[i] = '9';
        }
        return Integer.parseInt(String.valueOf(c));
    }
}
