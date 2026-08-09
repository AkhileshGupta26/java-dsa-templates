package Graph.ShortestPathAlgo;

public class dijkstra {
/*

########### SINGLE SOURCE SHORTEST PATH ALGORITHM ########

PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> a[1] - b[1]
);

int[] dist = new int[n];
Arrays.fill(dist, Integer.MAX_VALUE);

dist[src] = 0;

// {node, distance}
pq.offer(new int[]{src, 0});

while (!pq.isEmpty()) {

    int[] cur = pq.poll();

    int node = cur[0];
    int d = cur[1];

    // Ignore outdated entry
    if (d > dist[node])
        continue;

    for (int[] nei : graph.get(node)) {

        int next = nei[0];
        int wt = nei[1];

        if (d + wt<dist[next]) {

            dist[next] = d + wt;

            pq.offer(new int[]{
                next,
                dist[next]
            });
        }
    }
}





Recognition Pattern

If the problem says:

Minimum cost
Minimum effort
Minimum delay
Shortest weighted path
Cheapest route

and weights are:
Not all equal
Immediately think:
Dijkstra


















*/    
    
}
