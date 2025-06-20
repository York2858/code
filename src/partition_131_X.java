import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*131. 分割回文串
给你一个字符串 s，请你将 s 分割成一些 子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。

示例 1：
输入：s = "aab"
输出：[["a","a","b"],["aa","b"]]

示例 2：
输入：s = "a"
输出：[["a"]]

提示：
        1 <= s.length <= 16
        s 仅由小写英文字母组成
*/
public class partition_131_X {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        backing(s,0);
        return res;
    }
    void backing(String s,int startIndex){
        if(startIndex == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = startIndex; i < s.length(); i++){
            if(isVaild(s,startIndex,i)){
                path.add(s.substring(startIndex,i+1));
                backing(s,i+1);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isVaild(String s,int startIndex,int endIndex){
        while(startIndex < endIndex){
            if(s.charAt(startIndex) != s.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
