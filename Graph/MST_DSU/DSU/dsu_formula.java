package Graph.MST_DSU.DSU;

public class dsu_formula {
/*

The DSU Formula
Almost every DSU problem follows:


DSU dsu = new DSU(n);
for(each relation){
    dsu.union(a,b);
}

for(each query){
    dsu.find(...)
}

or

if(!dsu.union(a,b))

or

return dsu.getComponents();



That's why once the template is written, the real skill becomes identifying what the "nodes" are and what should be unioned.
For example:
Problem	Node	Union Condition
Provinces	City	Connected city
Accounts Merge	Account	Same email
Redundant Connection	Vertex	Edge
Number of Islands II	Cell	Adjacent land
Kruskal	Vertex	Edge selected



::::::::::::  making dsu  ::::::::: 

Case 1: Edge List
int[][] edges = {
    {0,1},
    {1,2},
    {3,4}
};

Most common.
For every edge:
for(int[] e : edges)
{
    dsu.union(e[0], e[1]);
}

Case 2: Grid Problems
Example:
1 1 0
1 0 1
0 1 1

Each cell becomes a node.
When adjacent cells are 1:
union(cell1, cell2);

This is used in:
Number of Islands II
Making Large Island
Max Area of Island (DSU version)


Case 3: Friend Relationships
Input:
A is friend of B
B is friend of C

Process:

union(A,B);
union(B,C);

Now DSU knows:

A,B,C are in same group











*/    
    
}
