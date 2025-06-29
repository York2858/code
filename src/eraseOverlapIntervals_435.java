import java.util.Arrays;

public class eraseOverlapIntervals_435 {
    public int solution(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a, b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        int count = 1;
        for(int i = 1;i < n; i++){
            if(intervals[i][0] >= intervals[i-1][1]){
                count++;
            }else{
                intervals[i][1] = Math.min(intervals[i][1],intervals[i-1][1]);
            }
        }
        return n-count;
    }
}
