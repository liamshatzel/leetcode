//slow but low memeory
import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
       int counter = 0; 
       for(int i = 0; i < nums.length; i++) {
           for(int j = i+1; j < nums.length; j++){
              if(nums[i] == nums[j]){
                  nums[i] = 101;
                  counter++;
              }
           }
          }
        
       Arrays.sort(nums);
       for(int x = 0; x < nums.length; x++){
           System.out.println(nums[x]);
       }
       System.out.println(counter);
       return nums.length - counter;
       }
}

