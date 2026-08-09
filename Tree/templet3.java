package Tree;

public class templet3 {
    

    // BFS-> BFS / Level Order Traversal

    /*
    
When to recognize BFS?

Whenever problem says:

level order
level by level
nearest
shortest levels
right view
zigzag
average of levels
    
    
    
Queue<TreeNode> q = new LinkedList<>();

q.offer(root);

while(!q.isEmpty()){

    int size = q.size();

    for(int i = 0; i < size; i++){

        TreeNode curr = q.poll();

        // process current node

        if(curr.left != null){
            q.offer(curr.left);
        }

        if(curr.right != null){
            q.offer(curr.right);
        }
    }
}





class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()) {

            int size = q.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                level.add(curr.val);

                if(curr.left != null) {
                    q.offer(curr.left);
                }

                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
