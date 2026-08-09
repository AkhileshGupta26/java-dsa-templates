package Graph.ToplogicalSort;

public class bfs {

/*
Defination:It is a linear ordering of vertices such that if there is a edge 
from u to v (u->v), u always appear before v in ordering.
: there can be more than 1 such ordering 
: Topological sort is only valid in DAG (Directed Acyclic Graph).
->Indegree: Number of incoming edges to a node.


########## IMP ###### So yes, Kahn's algorithm is useful even when the graph contains cycles.
 The nodes left unprocessed tell you valuable information about those cycles. 
 This idea appears in several advanced graph interview problems.

Eventual Safe States
Run Kahn on reversed graph
Nodes that get processed
    Safe nodes
Nodes that never get processed
    Can reach a cycle


List<Integer> topoSort(int n,
                       List<List<Integer>> graph){

    int[] indegree=new int[n];

    for(int i=0;i<n;i++){

        for(int nei:graph.get(i)){
            indegree[nei]++;
        }
    }

    Queue<Integer> q=new LinkedList<>();

    for(int i=0;i<n;i++){

        if(indegree[i]==0){
            q.offer(i);
        }
    }

    List<Integer> ans=new ArrayList<>();

    while(!q.isEmpty()){

        int node=q.poll();

        ans.add(node);

        for(int nei:graph.get(node)){

            indegree[nei]--;

            if(indegree[nei]==0){
                q.offer(nei);
            }
        }
    }

    return ans;
}

*/    
    
}
