package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class templet1 {

    // DFS Traversal (Depth First Search)

    // public int dfs(TreeNode root) {

    // // Base case
    // if(root == null) {
    //     return ?;
    // }

    // // Solve children
    // int left = dfs(root.left);
    // int right = dfs(root.right);

    // // Build answer for current node
    // return combine(left, right, root);
}

/*

| Problem     | Return Type |
| ----------- | ----------- |
| Count nodes | int         |
| Height      | int         |
| Sum         | int         |
| Search      | boolean     |
| Same tree   | boolean     |


 // SAME TREE PROBLEM

 public boolean dfs(TreeNode p,TreeNode q){
        // case 1 -> if both null i.e true
        // case 2-> if 1 null other not i.e. false
        // case 3-> if value not match i.e. false

        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        if(p.val!=q.val)return false;

        boolean l=dfs(p.left,q.left);
        boolean r=dfs(p.right,q.right);
        return l &&r;

    }

//INORDER TRAVERSAL

 public void dfs(TreeNode root, List<Integer> ans){
        // root->left->right
        

        if(root==null){
            return ;
        }
        ans.add(root.val);
        dfs(root.left,ans);
       
        dfs(root.right,ans);
         
    }


    / INORDER TRAVERSAL USING STK

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         Stack<TreeNode> stk=new Stack<>();
         
//         //  base case
//         if(root==null)return ans;
//         stk.push(root);

//         while(!stk.isEmpty()){
//             TreeNode temp=stk.pop();
//             ans.add(temp.val);
//             if(temp.left!=null)stk.push(temp.left);
//             if(temp.right!=null)stk.push(temp.right);

//         }
//         Collections.reverse(ans);
//         return ans;

        
//     }
// }









    
    











    





*/
    
}
