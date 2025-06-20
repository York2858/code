import java.util.*;

public class groupAnagrams_49 {
    public List<List<String>> solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key =  new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }
}
