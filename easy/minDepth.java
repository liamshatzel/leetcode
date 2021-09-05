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
class Solution {
    public int minDepth(TreeNode root) {
            //incase input tree = null
        if(root == null){
            return 0;
        }
        //tree with height 1
        if(root.left == null && root.right == null){
            return 1;
        }
        
        //if left node is empty recursively call right 
        if(root.left == null){
            return minDepth(root.right) + 1;
        }
        
        if(root.right == null){
            return minDepth(root.left) + 1;
        }
        //finally return the minimum of both traversed paths 
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1; 
     
    }
}

