package Tree;

import javax.swing.tree.TreeNode;

public class templet2 {


// public void dfs(TreeNode root, State state){

//     if(root == null) {
//         return;
//     }

//     // Update state using current node

//     // Pass updated state to children

//     if(root.left==null && root.right==null){
//         ans.add();
//         return ;
//     }
//     dfs(root.left, newState);

//     dfs(root.right, newState);
// }

/*
class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    public boolean dfs(TreeNode root, int remaining) {

        if(root == null) {
            return false;
        }

        // Use current node
        remaining = remaining - root.val;

        // Leaf node
        if(root.left == null && root.right == null) {
            return remaining == 0;
        }

        // Search left or right
        return dfs(root.left, remaining)
                || dfs(root.right, remaining);
    }
}







*/


    
}
