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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList();
        }
        return dfs(1, n);
    }
        private List<TreeNode> dfs(int s, int e){
            List<TreeNode> res = new ArrayList();
            
            if(s > e){
                res.add(null);
                return res;
            }
            
            for(int i = s; i <= e; i++){
                List<TreeNode> left = dfs(s, i-1);
                List<TreeNode> right =  dfs(i+1, e);
                for(TreeNode l : left){
                    for(TreeNode r: right){
                        res.add(new TreeNode(i,l,r));
                    }
                }
            }
            return res;
            
        }
        
    }

