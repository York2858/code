public class canCompleteCircuit_134 {
    public int solution(int[] gas, int[] cost) {
        int n = gas.length;
        int curSum = 0,totalSum = 0;
        int res = 0;

        for(int i = 0; i < n; i++){
            curSum += (gas[i] - cost[i]);
            totalSum += (gas[i] - cost[i]);
            if(curSum < 0){
                res = i+1;
                curSum = 0;
            }
        }
        if(totalSum < 0){
            return -1;
        }
        return res;
    }
}
