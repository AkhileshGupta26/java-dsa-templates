package Graph.CycleDetection.UndirectedGraph;

public class bfs {

/* 

boolean bfs(int src, List<List<Integer>> graph, boolean[] vis){

    Queue<int[]> q = new LinkedList<>();

    q.offer(new int[]{src, -1});
    vis[src] = true;

    while(!q.isEmpty()){

        int[] cur = q.poll();

        int node = cur[0];
        int parent = cur[1];

        for(int nei : graph.get(node)){

            if(!vis[nei]){

                vis[nei] = true;
                q.offer(new int[]{nei, node});
            }

            else if(nei != parent){

                return true;
            }
        }
    }

    return false;
}


























*/   
    
}
