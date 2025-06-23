import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combine_77 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int n,k;
    public List<List<Integer>> solution(){
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        this.k = sc.nextInt();
        backing(1);
        return res;
    }
    public void backing(int startIndex){
        if(path.size() >= k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = startIndex; i <= n; i++){
            path.add(i);
            backing(i+1);
            path.remove(path.size()-1);
        }
    }
}
