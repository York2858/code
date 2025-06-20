import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class canFinish_207_X {
    List<List<Integer>> graph;
    int[] visited;
    boolean isVaild;
    public boolean  solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] prerequisites = new int[n][2];
        for (int i = 0; i < n; i++) {
            prerequisites[i][0] = sc.nextInt();
            prerequisites[i][1] = sc.nextInt();
        }
        int numCourses = sc.nextInt();
        graph = new ArrayList<>();
        visited = new int[numCourses];
        isVaild = true;
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            graph.get(p[0]).add(p[1]);
        }
        for(int i = 0; i < numCourses; i++){
            if(visited[i] == 0){
                dfs(i);
            }
        }
        if(isVaild){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        return isVaild;

    }
    public void dfs(int i){
        // 正在访问
        visited[i] = 1;
        for(int j : graph.get(i)){
            if(visited[j] == 0){
                dfs(j);
                if(!isVaild){
                    return;
                }
            }else if(visited[j] == 1){
                isVaild = false;
                return;
            }
        }
        // 访问结束
        visited[i] = 2;
    }
}
