import java.util.HashSet;
import java.util.Scanner;

public class isHappy_202_X {
    public boolean solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        while(true){
            n = getSum(n);
            if(n == 1) return true;
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
        }
    }
    private int getSum(int n){
        int sum = 0;
        while(n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
