import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subsetsWithDup_90 {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] used;
        public List<List<Integer>> solution() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            used = new int[nums.length];
            backing(nums,0);
            return res;
        }
        public void backing(int[] nums,int startIndex) {
            res.add(new ArrayList<>(path));
            for (int i = startIndex; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == 0) {
                    continue;
                }
                used[i] = 1;
                path.add(nums[i]);
                backing(nums, i + 1);
                path.remove(path.size() - 1);
                used[i] = 0;
            }
        }
}
