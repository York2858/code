import util.TreeNode;

import java.util.HashSet;
import java.util.Scanner;

public class intersection_349 {
    public int[] solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num1 = new int[n];
        for(int i = 0; i < n; i++){
            num1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] num2 = new int[m];
        for(int i = 0; i < m; i++){
            num2[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(!set.contains(num1[i])){
                set.add(num1[i]);
            }
        }
        HashSet<Integer> resSet = new HashSet<>();
        for(int i = 0; i < m; i++){
            if(set.contains(num2[i])){
                resSet.add(num2[i]);
            }
        }
        int[] res = new int[resSet.size()];
        int index = 0;
        for(int num : resSet){
            res[index++] = num;
        }
        return res;
    }
}
