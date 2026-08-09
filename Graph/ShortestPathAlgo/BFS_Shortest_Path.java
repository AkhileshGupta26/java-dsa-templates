package Graph.ShortestPathAlgo;

public class BFS_Shortest_Path {
/*

Template Modification:
Queue<Integer>
+
dist[]


/////// CORE TEMPLET
/// 

int[] dist = new int[n];
Arrays.fill(dist,Integer.MAX_VALUE);
dist[src] = 0;
Queue<Integer> q = new LinkedList<>();
q.offer(src);

while(!q.isEmpty()){

    int node = q.poll();

    for(int nei : graph.get(node)){

        if(dist[nei] > dist[node] + 1){

            dist[nei] = dist[node] + 1;

            q.offer(nei);
        }
    }
}






///  ///// GRID VERSION    ////// //////
/// 
int[][] dist = new int[m][n];

for(int[] row : dist)
    Arrays.fill(row,Integer.MAX_VALUE);

dist[sr][sc] = 0;
Queue<int[]> q = new LinkedList<>();
q.offer(new int[]{sr,sc});
while(!q.isEmpty()){

    int[] cur = q.poll();

    int r = cur[0];
    int c = cur[1];

    for(int[] d : dir){

        int nr = r + d[0];
        int nc = c + d[1];

        if(valid -> boudary condition and question condition){

            if(dist[nr][nc] >
               dist[r][c] + 1){

                dist[nr][nc] =
                dist[r][c] + 1;

                q.offer(
                    new int[]{nr,nc}
                );
            }
        }
    }
}


















*/    
    
}
