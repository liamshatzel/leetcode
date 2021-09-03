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
    //Static TreeNode root = new TreeNode();
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return sortedArrayToBST(nums, 0, n-1);

}
    TreeNode sortedArrayToBST(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = sortedArrayToBST(arr, start, mid -1);
        node.right = sortedArrayToBST(arr, mid+1, end);
        return node;
    }
        
    }
//Yes I know how to overload methods GG
