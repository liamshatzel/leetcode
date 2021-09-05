class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length; i++){
           int count = 0; 
           while(nums[i] >= 1){
              nums[i] = nums[i] / 10;
              count++; 
           }
           if(count % 2 == 0){
               even++;
           }
        }
        return even;
    }
}
//MATH - Divide by 10 add 1 to count evertime the remainder is more than 1; java auto rounds int down
