import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class dailyTemperatures_739 {
    public int[] solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temperatures  = new int[n];
        for(int i = 0; i < n; i++){
            temperatures[i] = sc.nextInt();
        }
        int[] answer = new int[n];
        Deque<Integer> stack = new LinkedList<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty()){
                int x = stack.peek();
                if(temperatures[i] > temperatures[x]){
                    answer[x] = i-x;
                    stack.pop();
                }else{
                    break;
                }
            }
            stack.push(i);
        }
        return answer;
    }
}
