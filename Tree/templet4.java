package Tree;

public class templet4 {


/*


TREE DP

class Solution {

    int globalAnswer = 0;

    public int solve(TreeNode root) {

        dfs(root);

        return globalAnswer;
    }

    public int dfs(TreeNode root) {

        // 1. Base case
        if(root == null) {
            return 0;
        }

        // 2. Get info from children
        int left = dfs(root.left);
        int right = dfs(root.right);

        // 3. Use children's info to update answer
        updateGlobalAnswer(left, right, root);

        // 4. Return something useful to parent
        return valueForParent(left, right, root);
    }
}


Every Tree DP problem asks 2 questions

Before coding, always answer:

Question 1
What should current node return to parent?

Examples:

Diameter
Return:

height
Formula:

height=max(left,right)+1

Balanced Tree

Return:

height

and maybe invalid signal.

Maximum Path Sum

Return:

best single branch
Question 2
What global answer should be updated here?

Examples:

Diameter
Update:
diameter=left+right

Balanced Tree

Update:
























































*/
    
}
