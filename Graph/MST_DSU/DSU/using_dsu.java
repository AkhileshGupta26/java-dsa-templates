package Graph.MST_DSU.DSU;

public class using_dsu {
/*

Pattern 1: Cycle Detection
Problem:
Adding edge creates cycle?
Example:
[1,2]
[1,3]
[2,3]

Usage:

DSU dsu = new DSU(n + 1);

for(int[] edge : edges){

    int u = edge[0];
    int v = edge[1];

    if(!dsu.union(u,v)){
        return edge;
    }
}

Why?

union()
returns:
false
only when:
find(u)==find(v)
already connected.


Pattern 2: Count Components
Problem:
How many groups exist?
Example:
0-1
2-3
4

Answer:
3 components
Usage:
DSU dsu = new DSU(n);
for(int[] edge : edges){
    dsu.union(edge[0], edge[1]);
}
return dsu.getComponents();
That's it.


Pattern 3: Connectivity Query
Problem:
Are a and b connected?
Usage:
if(dsu.isConnected(a,b))

or

if(dsu.find(a)==dsu.find(b))

Example:

Friend Network
Network Connections


Pattern 4: Grouping
Most important medium pattern.
Example:

Accounts Merge

Input:

John
a@gmail
b@gmail

John
b@gmail
c@gmail

Observe:

same email
⇒ same person

Usage:
union(account1, account2)
Then later:
root = find(account)
Group all accounts having same root.


Pattern 5: Largest Component
Problem:
Largest connected group?
Usage:
ans = Math.max(
    ans,
    dsu.getSize(node)
);


Pattern 6: Grid DSU
Very important.
Convert:
(r,c)
into:
node = r * n + c;
Example:

3 x 3
0 1 2
3 4 5
6 7 8
Now grid becomes graph.
Use DSU normally.


Pattern 7: Kruskal MST
Sort edges:
Arrays.sort(edges);
Then:

for(edge){

    if(dsu.union(u,v)){
        mstCost += wt;
    }
}

Why?

Only add edge if it doesn't create a cycle.







*/    
    
}
