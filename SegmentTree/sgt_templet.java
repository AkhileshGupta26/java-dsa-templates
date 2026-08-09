package SegmentTree;

public class sgt_templet {
  
}
class SegmentTree {

    // tc=N*log(n) some less than binary search  
    // sc=O(4*n);
    int[] tree;
    int n;
    // for 1 based indexing
    // for 0 based indexing use 2n+1 and 2n+2 
    SegmentTree(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];
        build(1, 0, n - 1, arr);
    }
    // arr-> given input array

    void build(int node, int start, int end, int[] arr) {
        // base case → leaf node
        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        // build children
        build(2 * node, start, mid, arr);
        build(2 * node + 1, mid + 1, end, arr);

        // merge step
        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    int query(int node, int start, int end, int l, int r) {

        //  no overlap
        if (r < start || end < l) return identity();

        //  complete overlap
        if (l <= start && end <= r) return tree[node];

        //  partial overlap
        int mid = (start + end) / 2;

        int left = query(2 * node, start, mid, l, r);
        int right = query(2 * node + 1, mid + 1, end, l, r);

        return merge(left, right);
    }

    // point update

    void update(int node, int start, int end, int idx, int val) {

        // leaf
        if (start == end) {
            tree[node] = val;
            return;
        }

        int mid = (start + end) / 2;

        if (idx <= mid)
            update(2 * node, start, mid, idx, val);
        else
            update(2 * node + 1, mid + 1, end, idx, val);

        // recalc
        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    //  YOU CHANGE THESE 2 ONLY
    int merge(int a, int b) {
        return a + b; // example: sum
    }

    int identity() {
        return 0; // example: sum
    }
     
}

