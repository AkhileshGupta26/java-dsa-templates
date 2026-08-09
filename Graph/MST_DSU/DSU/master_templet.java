package Graph.MST_DSU.DSU;

public class master_templet {
/*

class DSU {

    int[] parent;
    int[] size;
    int components;

    DSU(int n) {

        parent = new int[n];
        size = new int[n];
        components = n;

        for(int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
    
    int find(int x) {

        if(parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    boolean union(int a, int b) {

        int pa = find(a);
        int pb = find(b);

        if(pa == pb)
            return false;

        if(size[pa] < size[pb]) {

            parent[pa] = pb;
            size[pb] += size[pa];

        } else {

            parent[pb] = pa;
            size[pa] += size[pb];
        }

        components--;

        return true;
    }

    boolean isConnected(int a, int b) {
        return find(a) == find(b);
    }

    int getSize(int x) {
        return size[find(x)];
    }

    int getComponents() {
        return components;
    }
}




















*/ 
    
}
