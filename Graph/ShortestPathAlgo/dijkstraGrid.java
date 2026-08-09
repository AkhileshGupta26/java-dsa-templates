package Graph.ShortestPathAlgo;

import java.util.Arrays;

public class dijkstraGrid {
/*

int[][] dir = {
    {-1,0},
    {0,-1},
    {1,0},
    {0,1}
};

PriorityQueue<int[]> pq =
    new PriorityQueue<>(
        (a,b) -> a[0] - b[0]
    );


// a[0] = distance
// a[1] = row
// a[2] = col


int[][] dist = new int[m][n];

for(int[] row : dist){
    Arrays.fill(row,Integer.MAX_VALUE);
}

dist[sr][sc] = 0;

pq.offer(new int[]{0,sr,sc});

while(!pq.isEmpty()){

    int[] cur = pq.poll();

    int d = cur[0];
    int r = cur[1];
    int c = cur[2];

    if(d > dist[r][c])
        continue;

    for(int[] move : dir){

        int nr = r + move[0];
        int nc = c + move[1];

        if(nr < 0 || nc < 0 ||
           nr >= m || nc >= n)
            continue;

        int wt = grid[nr][nc];

        if(dist[nr][nc] > d + wt){

            dist[nr][nc] = d + wt;

            pq.offer(
                new int[]{
                    dist[nr][nc],
                    nr,
                    nc
                }
            );
        }
    }
}
















































*/    
    
}
