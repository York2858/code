import java.util.Scanner;

public class numIslands_200 {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] grid = new char[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int res = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    bfs(grid,i,j);
                    res += 1;
                }
            }
        }
        return res;
    }
    public void bfs(char[][] grid,int row,int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != '1'){
            return;
        }
        grid[row][col] = '2';
        bfs(grid,row+1,col);
        bfs(grid,row-1,col);
        bfs(grid,row,col+1);
        bfs(grid,row,col-1);
    }
}
