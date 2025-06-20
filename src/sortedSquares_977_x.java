import java.util.Scanner;

/*977. 有序数组的平方
给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

示例 1：
输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]

示例 2：
输入：nums = [-7,-3,2,3,11]
输出：[4,9,9,49,121]

提示：
        1 <= nums.length <= 104
        -104 <= nums[i] <= 10*/
public class sortedSquares_977_x {
    public int[] solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = new int[n];
        int k = n-1;
        for (int l = 0,r = n-1; l <= r;k--) {
            if(nums[l]*nums[l] > nums[r]*nums[r]) {
                res[k] = nums[l]*nums[l];
                l++;
            }else{
                res[k] = nums[r]*nums[r];
                r--;
            }
        }
        return res;
    }
}
