package Graph.OtherAlgorithms;

public class KosarajuAlgorithm {
/*

void dfs1(int node,
          boolean[] vis,
          Stack<Integer> st,
          ArrayList<ArrayList<Integer>> graph){

    vis[node] = true;

    for(int nei : graph.get(node)){

        if(!vis[nei])
            dfs1(nei,vis,st,graph);
    }

    st.push(node);
}

void dfs2(int node,
          boolean[] vis,
          ArrayList<ArrayList<Integer>> rev){

    vis[node] = true;

    for(int nei : rev.get(node)){

        if(!vis[nei])
            dfs2(nei,vis,rev);
    }
}

Stack<Integer> st = new Stack<>();

boolean[] vis = new boolean[n];

for(int i=0;i<n;i++){

    if(!vis[i])
        dfs1(i,vis,st,graph);
}

Reverse graph.
Reset visited.
Arrays.fill(vis,false);

Count SCCs.

int scc = 0;

while(!st.isEmpty()){

    int node = st.pop();

    if(!vis[node]){

        dfs2(node,vis,rev);

        scc++;
    }
}























What Problem Does Kosaraju Solve?

It finds:
Strongly Connected Components (SCC)
in a directed graph.

What is an SCC?
In a directed graph:
0 → 1
↑   ↓
3 ← 2

Every node can reach every other node.
Example:

0 → 1 → 2 → 3 → 0
From any node:
Can reach every other node
This forms one SCC.


*/    
    
}
