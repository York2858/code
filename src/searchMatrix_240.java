import java.util.Scanner;

public class searchMatrix_240 {
    public boolean solution(){
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int i = m-1, j = 0;
        while(i >=0 && j < n){
            if(matrix[i][j] == target){
                System.out.println("True");
                return true;
            }else if(matrix[i][j] > target){
                i--;
            }else{
                j++;
            }
        }
        System.out.println("False");
        return false;
    }

}
