class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int temp = Math.abs(nums[i]);
            nums[i] = temp * temp;
        }
        Arrays.sort(nums);
        return nums;
    }
}
//Naive solution. Slow and heavy but it works
