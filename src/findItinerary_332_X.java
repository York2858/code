import java.util.*;

/*332. 重新安排行程
给你一份航线列表 tickets ，其中 tickets[i] = [fromi, toi] 表示飞机出发和降落的机场地点。请你对该行程进行重新规划排序。
所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。如果存在多种有效的行程，请你按字典排序返回最小的行程组合。
例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排序更靠前。
假定所有机票至少存在一种合理的行程。且所有的机票 必须都用一次 且 只能用一次。

示例 1：
输入：tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
输出：["JFK","MUC","LHR","SFO","SJC"]

示例 2：
输入：tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
输出：["JFK","ATL","JFK","SFO","ATL","SFO"]
解释：另一种有效的行程是 ["JFK","SFO","ATL","JFK","ATL","SFO"] ，但是它字典排序更大更靠后。


提示：
1 <= tickets.length <= 300
tickets[i].length == 2
fromi.length == 3
toi.length == 3
fromi 和 toi 由大写英文字母组成
fromi != toi
*/
public class findItinerary_332_X {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        List<String> path = new ArrayList<>();
        public List<String> solution(List<List<String>> tickets) {
            for(List<String> t : tickets){
                String start = t.get(0),end = t.get(1);
                if(!map.containsKey(start)){
                    map.put(start,new PriorityQueue<>());
                }
                map.get(start).offer(end);
            }
            dfs("JFK");
            Collections.reverse(path);
            return path;
        }
        public void dfs(String start){
            while(map.containsKey(start) && map.get(start).size() > 0){
                String next = map.get(start).poll();
                dfs(next);
            }
            path.add(start);
        }
}
