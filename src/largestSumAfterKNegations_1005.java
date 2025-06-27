import java.util.Arrays;

public class largestSumAfterKNegations_1005 {
    public int solution(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n && k > 0; i++){
            if(nums[i] < 0){
                nums[i] *= -1;
                k--;
            }
        }
        if(k % 2 == 1){
            Arrays.sort(nums);
            nums[0] *= -1;
        }
        int res = 0;
        for(int num : nums){
            res += num;
        }
        return res;
    }
}
