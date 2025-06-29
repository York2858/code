import java.util.Arrays;

public class findMinArrowShots_452 {
    public int solution(int[][] points) {
        int n = points.length;
        int res = 1;
        Arrays.sort(points, (a, b) ->Integer.compare(a[0], b[0]));
        for (int i = 1; i < n; i++) {
            if (points[i][0] > points[i-1][1]) {
                res++;
            }else{
                points[i][1] = Math.min(points[i][1],points[i-1][1]);
            }
        }
        return res;
    }
}
