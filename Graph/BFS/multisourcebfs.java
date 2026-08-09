package Graph.BFS;

public class multisourcebfs {

/*
// ROTTEN ORANGES 

class Solution {
    static int[][] dir = {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1}
    };

    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int minute = 0;

        // Initial scan
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;   //edge case

        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int r = cur[0];
                int c = cur[1];

                for (int[] d : dir) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;
                        rotted = true;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            if (rotted) minute++;
        }

        return fresh == 0 ? minute : -1;
    }
}
































*/
 
    
    
}
