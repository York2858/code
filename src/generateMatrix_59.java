import java.util.Scanner;

public class generateMatrix_59 {
    public int[][] solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int index = 1;
        int left = 0,right = n-1,up = 0,down = n-1;
        while(true){
            //上
            for(int i=left;i<=right;i++){
                matrix[up][i]= index++;
            }
            if(up++ > down) break;
            //右
            for(int i=up;i<=down;i++){
                matrix[i][right]= index++;
            }
            if(right-- < left) break;
            //下
            for(int i=right;i>=left;i--){
                matrix[down][i]= index++;
            }
            if(down-- < up) break;
            //左
            for(int i=down;i>=up;i--){
                matrix[i][left]= index++;
            }
            if(left++ > right) break;
        }
        return matrix;
    }
}
