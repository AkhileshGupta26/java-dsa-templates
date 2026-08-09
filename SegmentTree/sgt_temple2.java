package SegmentTree;

public class sgt_temple2 {
    
}
import java.util.*;

class SegmentTree {
    private int[] tree;
    private int n;

    public SegmentTree(int[] nums) {
        this.n = nums.length;
        this.tree = new int[4 * n];
        buildTree(nums, 0, n - 1, 1);
    }

    // Merge function (CHANGE THIS BASED ON PROBLEM)
    private int merge(int left, int right) {
        return left + right; // sum
    }

    private void buildTree(int[] nums, int s, int e, int node) {
        if (s == e) {
            tree[node] = nums[s];
            return;
        }

        int mid = s + (e - s) / 2;
        buildTree(nums, s, mid, 2 * node);
        buildTree(nums, mid + 1, e, 2 * node + 1);

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    private int rangeQuery(int s, int e, int node, int l, int r) {

        // no overlap
        if (r < s || e < l) return 0; // neutral for SUM

        // complete overlap
        if (l <= s && e <= r) return tree[node];

        int mid = s + (e - s) / 2;

        int left = rangeQuery(s, mid, 2 * node, l, r);
        int right = rangeQuery(mid + 1, e, 2 * node + 1, l, r);

        return merge(left, right);
    }

    private void updateTree(int s, int e, int node, int idx, int val) {
        if (s == e) {
            tree[node] = val;
            return;
        }

        int mid = s + (e - s) / 2;

        if (idx <= mid) {
            updateTree(s, mid, 2 * node, idx, val);
        } else {
            updateTree(mid + 1, e, 2 * node + 1, idx, val);
        }

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    // Public APIs
    public int query(int l, int r) {
        return rangeQuery(0, n - 1, 1, l, r);
    }

    public void update(int idx, int val) {
        updateTree(0, n - 1, 1, idx, val);
    }
}
