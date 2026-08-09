package Graph.ShortestPathAlgo;

public class Bellman_Ford {
/*

ALSO WORKS FOR -VE EDGES

Purpose:
Shortest Path with Negative Weights
Dijkstra fails when negative edges exist.

Dijkstra:
Pick best node
using PriorityQueue

Bellman-Ford:
Relax every edge
again and again


///////////// VVV IMP ////////

if(dist[u] != INF &&
   dist[u] + wt < dist[v]){

    dist[v] = dist[u] + wt;
}

############## TEMPLET Bellman Ford ###############

int[] dist = new int[n];

Arrays.fill(dist,(int)1e9);

dist[src] = 0;

for(int i=1;i<n;i++){

    for(int[] edge : edges){

        int u = edge[0];
        int v = edge[1];
        int wt = edge[2];

        if(dist[u] != (int)1e9 &&
           dist[u] + wt < dist[v]){

            dist[v] = dist[u] + wt;
        }
    }
}




































*/    
    
}
