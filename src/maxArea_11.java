import java.util.Scanner;

public class maxArea_11 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        int max = 0;
        int left = 0,right = n-1;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            max = Math.max(max, h * w);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}
