import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class evalRPN_150 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] tokens = new String[n];
        for(int i = 0; i < n; i++){
            tokens[i] = sc.next();
        }
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 + num1);
            } else if (tokens[i].equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }else if (tokens[i].equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2* num1);
            }else if (tokens[i].equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
