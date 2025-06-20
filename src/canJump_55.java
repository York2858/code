import java.util.Scanner;

public class canJump_55 {
    public boolean solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover, nums[i]+i);
            if(cover >= n-1){
                return true;
            }
        }
        return false;
    }
}
