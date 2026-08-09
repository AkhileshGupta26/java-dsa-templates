package Graph.DFS;

public class backtrackingdfs {
 /*
 
 ####### V.V IMP #######
class Solution {

    int[][] dir = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
    };

    boolean[][] visited;

    public int getMaximumGold(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        visited = new boolean[m][n];

        int ans = 0;

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                if(grid[i][j] != 0){

                    ans = Math.max(ans,
                            solve(i,j,grid));
                }
            }
        }

        return ans;
    }

    public int solve(int i,int j,int[][] grid){

        int m = grid.length;
        int n = grid[0].length;

        // Choose
        visited[i][j] = true;

        int best = 0;

        // Explore
        for(int[] d : dir){

            int nr = i + d[0];
            int nc = j + d[1];

            if(nr>=0 && nr<m &&
               nc>=0 && nc<n &&
               grid[nr][nc]!=0 &&
               !visited[nr][nc]){

                best = Math.max(best,
                        solve(nr,nc,grid));
            }
        }

        // Undo choice
        visited[i][j] = false;

        return grid[i][j] + best;
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */   
    
}
