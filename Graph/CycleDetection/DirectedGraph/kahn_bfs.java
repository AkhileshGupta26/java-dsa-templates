package Graph.CycleDetection.DirectedGraph;

public class kahn_bfs {
    
/*

boolean hasCycle(int n, List<List<Integer>> graph){

    int[] indegree = new int[n];

    for(int i=0;i<n;i++){
        for(int nei : graph.get(i)){
            indegree[nei]++;
        }
    }

    Queue<Integer> q = new LinkedList<>();

    for(int i=0;i<n;i++){
        if(indegree[i] == 0){
            q.offer(i);
        }
    }

    int count = 0;

    while(!q.isEmpty()){

        int node = q.poll();
        count++;

        for(int nei : graph.get(node)){

            indegree[nei]--;

            if(indegree[nei] == 0){
                q.offer(nei);
            }
        }
    }

    return count != n;
}






















*/    
}
