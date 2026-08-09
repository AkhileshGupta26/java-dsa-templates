package Graph.OtherAlgorithms;

public class Bridges_ArticulationPoints {
/*
################  BRIDGE TEMPLET #########

void dfs(int node,
         int parent,
         boolean[] vis,
         List<List<Integer>> graph){

    vis[node]=true;

    tin[node]=low[node]=timer++;

    for(int nei : graph.get(node)){

        if(nei==parent)
            continue;

        if(!vis[nei]){

            dfs(nei,node,vis,graph);

            low[node]=Math.min(
                low[node],
                low[nei]
            );

            if(low[nei] > tin[node]){

                // BRIDGE
            }

        }else{

            low[node]=Math.min(
                low[node],
                tin[nei]
            );
        }
    }
}

##################  Articulation Template  ###############

Inside DFS:

int child=0;

Tree Edge:

if(!vis[nei]){

    child++;

    dfs(nei,node,...);

    low[node]=Math.min(
        low[node],
        low[nei]
    );

    if(parent!=-1 &&
       low[nei] >= tin[node]){

        articulation[node]=true;
    }
}

Root Check:

if(parent==-1 &&
   child>1){

    articulation[node]=true;
}


























Bridge Definition
An edge whose removal increases:
Number of Connected Components

Articulation Point Definition
A vertex whose removal increases:
Number of Connected Components


Core Idea

We run DFS.
For every node store:

tin[node]

means:
Time of Entry

Also store:

low[node]
means:
Earliest node
reachable from this subtree


*/    
    
}
