import java.util.HashMap;
import java.util.Scanner;

public class lengthOfLongestSubstring_3 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i])){
                left = Math.max(left, map.get(ch[i])+1);
            }
            map.put(ch[i], i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
