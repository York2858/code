import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class decodeString_394 {
    public String solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<String> strStack = new LinkedList<>();
        Deque<Integer> numStack = new LinkedList<>();
        int num = 0;
        StringBuilder res = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] >= '0' && ch[i] <= '9'){
                num = num * 10 + ch[i] - '0';
            }else if(ch[i] == '[') {
                numStack.push(num);
                num = 0;
                strStack.push(new String(res));
                res = new StringBuilder();
            }else if(ch[i] == ']'){
                StringBuilder temp = new StringBuilder();
                int k = numStack.pop();
                for (int j = 0; j < k;j++){
                    temp.append(res);
                }
                res = new StringBuilder(strStack.pop() + temp);
            }else{
                res.append(ch[i]);
            }
        }
        return res.toString();
    }
}
